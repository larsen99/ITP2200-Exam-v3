package HomeWorkOutPlan;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Program {
    private List<Exercise> exerciseList = new ArrayList<>();
    private List<Program> programList = new ArrayList<>();
    private int intensity = 0;
    boolean balanced = false;

    public void setExerciseList(List<Exercise> exercise) {
        this.exerciseList = exercise;
    }

    public int getIntensity() {
        for (Exercise ex : exerciseList) {
            if (ex.getIntensity() > this.intensity) this.intensity = ex.getIntensity();
        }
        return this.intensity;
    }
    public boolean isBalanced() {
        String exerciseString = exerciseList.toString().toLowerCase();
        if (exerciseList.size() >= 4 &&
                exerciseString.contains("endurance") &&
                exerciseString.contains("flexibility") &&
                exerciseString.contains("strength") &&
                exerciseString.contains("balance"))
            this.balanced = true;
        return this.balanced;
    }

    public List<Exercise> getExerciseList() {
        return this.exerciseList;
    }
    public List<Exercise> sortExercise() {
        Collections.sort(this.exerciseList);
        return this.exerciseList;
    }
    public List<Exercise> sortExercise(List<Exercise> list) {
        Collections.sort(list);
        return list;
    }
    public int calculateDuration() {
        int total = 0;
        for (Exercise ex : this.exerciseList) total += (ex.duration * 2);
        return total;
    }
    public void makeProgram(List<Exercise> exercises, Program program) {
        program.setExerciseList(exercises);
        if (program.isBalanced()) {
            programList.add(program);
            String str = program.getExerciseList().stream().map(Object::toString)
                    .collect(Collectors.joining("\n"));
            System.out.println(String.format("Program has been made.\n" +
                    "Estimated duration: %d minutes.\n" +
                    "Is the program balanced? " + (program.isBalanced() ? "Yes" : "No") +
                    "\nThese are the exercises:\n%s", program.calculateDuration(), str));
        }
    }
    public boolean doesProgramFit(Person person, Program program) {
        AtomicBoolean ret = new AtomicBoolean(false);
        program.getExerciseList().forEach(ex -> {
            ret.set(ex.getIntensity() >= (person.acceptableIntensity - 10) && ex.getIntensity() <= (person.acceptableIntensity + 10));
        });
        return ret.get();
    }
    public String giveProgram(Person person) {
        int number = 100;
        int saveNumber = 100;
        for (Program program : this.programList) {
            int acceptableIntensity = person.acceptableIntensity;
            int currentIntensity = program.getIntensity();
            if (doesProgramFit(person, program)) {
                for (int i = 10; i > 0; i--) {
                    if (acceptableIntensity <= (currentIntensity + i) &&
                            acceptableIntensity >= (currentIntensity - i)) number = i;
                }
                if (number < saveNumber) {
                    saveNumber = number;
                    person.currentProgram = program;
                }
            }
        }
        if (person.currentProgram.getIntensity() == 0) {
            return "Sorry, we can not find an appropriate program for you.";
        }
        return String.format("You will get this following program, matching your requirements:\n" +
                        "Intensity level is : %d%%\n" +
                        "Your preferred intensity: %d%%\n" +
                        "%s",
                person.currentProgram.getIntensity(), person.acceptableIntensity,
                person.currentProgram.getExerciseList().toString());
    }
}