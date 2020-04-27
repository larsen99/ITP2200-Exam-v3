package HomeWorkOutPlan;

public class Person {
    String selectPreferredExercise;
    int acceptableIntensity;
    Program currentProgram;

    public Program getCurrentProgram() {
        return currentProgram;
    }

    public int getAcceptableIntensity() {
        return acceptableIntensity;
    }

    public String getSelectPreferredExercise() {
        return selectPreferredExercise;
    }

    public Person(String selectPreferredExercise, int acceptableIntensity, Program currentProgram) {
        this.selectPreferredExercise = selectPreferredExercise;
        this.acceptableIntensity = acceptableIntensity;
        this.currentProgram = currentProgram;
    }

    @Override
    public String toString() {
        return "This is the preferred exercise for you: " + selectPreferredExercise + '\n' +
                "Acceptable intensity for you: " + acceptableIntensity + " %" + '\n' +
                "This is the current program: " + currentProgram.getExerciseList() + '\n';
    }
}