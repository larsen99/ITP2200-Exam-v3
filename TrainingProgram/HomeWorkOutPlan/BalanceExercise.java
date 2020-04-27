package HomeWorkOutPlan;

public class BalanceExercise extends Exercise{
    String equipment;

    public BalanceExercise(String name, int intensity, int duration, int sets, int repetitions, String equipment) {
        super(name, intensity, duration, sets, repetitions);
        this.equipment = equipment;
    }

    public String getEquipment() {
        return equipment;
    }

    @Override
    public String toString() {
        return  name + ": " + "This is an Balance exercise, and for this exercise you will need "+ equipment + '\n' +
                "The intensity of this exercise is " + intensity + "% " +'\n' +
                "Exercise duration is " + duration + " mins "+ '\n' +
                sets + " sets " +'\n' +
                repetitions + " repetitions" +'\n'+'\n';
    }
}
