package HomeWorkOutPlan;

public class EnduranceExercise extends Exercise{
    String equipment;

    public EnduranceExercise(String name, int intensity, int duration, int sets, int repetitions, String equipment) {
        super(name, intensity, duration, repetitions, sets);
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return name + ": " + " This is an Endurance exercise, and for this you need "+ equipment + '\n' +
                "The intensity of this exercise is " + intensity + "% " +'\n' +
                "Exercise duration is " + duration + " mins "+ '\n' +
                sets + " sets " +'\n' +
                repetitions + " repetitions" +'\n'+'\n';
    }
}