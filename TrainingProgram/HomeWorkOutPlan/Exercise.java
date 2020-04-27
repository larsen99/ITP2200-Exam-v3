package HomeWorkOutPlan;

public abstract class Exercise implements Comparable<Exercise> {
    String name;
    int intensity;
    int duration;
    int sets;
    int repetitions;

    public Exercise(String name, int intensity, int duration, int sets, int repetitions) {
// The intensity can not be a negative value, 0, 100 or over 100
        if (intensity >= 100 || intensity <= 0) {
            throw new IllegalArgumentException("Not valid Intensity value ");
        }

        this.name = name;
        this.intensity = intensity;
        this.duration = duration;
        this.sets = sets;
        this.repetitions = repetitions;

    }

    @Override
    public String toString() {
        return "Exercise: " + name + '\n' +
                "The intensity level for this exercise is " + intensity + "% " +'\n' +
                "The duration for this exercise is  " + duration + " min "+ '\n' +
                sets + " sets" +'\n' +
                repetitions + " repetitions " +'\n'+'\n';
    }

    public int getIntensity(){
        return intensity;
    }

    public int getDuration() {
        return duration;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getSets() {
        return sets;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Exercise o) {
        return this.getIntensity()-o.getIntensity();
    }
}


