package HomeWorkOutPlan;

public class FlexibilityExercise extends Exercise{
    String requirement;

    public FlexibilityExercise(String name, int intensity, int duration, int sets, int repetitions, String requirements) {
        super(name, intensity, duration, repetitions, sets);
        this.requirement = requirements;
    }

    public String getRequirement() {
        return requirement;
    }

    @Override
    public String toString() {
        return  name + ": " + "This is a flexibility exercise, and for this you need: "+ requirement + '\n' +
                "The intensity of this exercise is " + intensity + "% " +'\n' +
                "Exercise duration is " + duration + " mins "+ '\n' +
                sets + " sets " +'\n' +
                repetitions + " repetitions" +'\n'+'\n';
    }

}