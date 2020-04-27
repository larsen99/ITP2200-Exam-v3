package HomeWorkOutPlan;

public class StrengthExercise extends Exercise {
    int weights;
    String equipment;

    public StrengthExercise(String name, int intensity, int duration, int sets, int repetitions, int weights, String equipment) {
        super(name, intensity, duration, sets, repetitions);
        this.weights = weights;
        this.equipment = equipment;
    }

    public int getWeights() {
        return weights;
    }

    public String getEquipment() {
        return equipment;
    }

    @Override
    public String toString() {
        return  name + ": " + "This is a strength exercise, and for this you need " + weights + " kg " + equipment + '\n' +
                "The intensity of this exercise is " + intensity + "% " +'\n' +
                "Exercise duration is " + duration + " mins "+ '\n' +
                sets + " sets " +'\n' +
                repetitions + " repetitions" +'\n'+'\n';
    }
}
