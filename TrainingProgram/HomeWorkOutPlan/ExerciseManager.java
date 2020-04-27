package HomeWorkOutPlan;

import java.util.ArrayList;

public class ExerciseManager {
    public static void main(String[] args) {

        Program programOne = new Program();
        Program programTwo = new Program();
        Program programTree = new Program();
        Program programFour = new Program();
        Program programFive = new Program();

        ArrayList<Exercise>exerciseOne = new ArrayList<>();
        ArrayList<Exercise>exerciseTwo = new ArrayList<>();
        ArrayList<Exercise>exerciseTree = new ArrayList<>();
        ArrayList<Exercise>exerciseFour = new ArrayList<>();
        ArrayList<Exercise>exerciseFive = new ArrayList<>();


// Program x is an empty program that is made for accessing the program class
        Program x = new Program();

//here we create exercises that can be added into programs
        exerciseOne.add(new StrengthExercise("Push ups",70,10,3,15,0,
                "Training mat"));
        exerciseOne.add(new BalanceExercise("Squat",50,15,4,25,
                "Training mat"));
        exerciseOne.add(new EnduranceExercise("Biking",60,30,1,1,
                "Timer and bike"));
        exerciseOne.add(new BalanceExercise("Forward lunges",20,10,5,25,
                "Training mat and resistance band"));

// sortIncreasingIntensity is referred to in the Program class, and it sorted the exercises with increasing intensity
        x.sortExercise(exerciseOne);

//createNewProgram is referred to method in Program-class, it uses the exercises we put in and turns them into programs
        x.makeProgram(exerciseOne, programOne);

        exerciseTwo.add(new EnduranceExercise("Intervals",45,16,4 ,2,
                "Timer and running shoes"));
        exerciseTwo.add(new EnduranceExercise("Jogging", 40, 20, 1, 1,
                "Timer and running shoes"));
        exerciseTwo.add(new FlexibilityExercise("Side lunges", 20, 7, 3, 25,
                "Training mat and resistance band"));
        exerciseTwo.add(new FlexibilityExercise("Seat straddle lotus", 20, 7, 3,
                15, " to be flexible in legs"));
        exerciseTwo.add(new FlexibilityExercise("Standing hamstring stretch", 20, 10, 3,
                15, "No requirements"));
        x.sortExercise(exerciseTwo);
        x.makeProgram(exerciseTwo, programTwo);


//Moore exercises to add to new programs
        exerciseTree.add(new StrengthExercise("Sit ups", 60, 15,4, 15,
                0, "Training mat"));
        exerciseTree.add(new StrengthExercise("Bent over row", 65, 10, 12, 3,
                15, "Barbell and weights"));
        exerciseTree.add(new FlexibilityExercise("Split", 15, 5, 2, 2,
                " to be able to do a split"));
        exerciseTree.add(new FlexibilityExercise("Frog stretch", 40, 10, 3, 3,
                " to be able to do a split"));
        exerciseTree.add(new BalanceExercise("Rock the boat", 50, 10, 3, 10,
                "Training mat"));
        exerciseTree.add(new BalanceExercise("Single leg dead lift", 40, 8, 3,
                12,"Kettle bell"));
        exerciseTree.add(new EnduranceExercise("Plank", 75, 2, 3, 1,
                "Training mat"));
        exerciseTree.add(new EnduranceExercise("Walking lunges", 65, 7, 3, 25,
                "Resistance band"));
        x.sortExercise(exerciseTree);
        x.makeProgram(exerciseTree, programTree);


        exerciseFour.add(new FlexibilityExercise("Triceps stretch",20,5,2,1,
                "No requirements"));
        exerciseFour.add(new StrengthExercise("Russian twist",50,10,3,20,
                10, "Training mat and medicine ball"));
        exerciseFour.add(new EnduranceExercise("Juming rope",80,15,4,50,
                "Jumping rope"));
        exerciseFour.add(new BalanceExercise("Sideways walking",25,10,3,25,
                "Resistance band"));
        x.sortExercise(exerciseFour);
        x.makeProgram(exerciseFour, programFour);


        exerciseFive.add(new FlexibilityExercise("Knees to chest",30,2,1,1,
                "Needs to have a good back"));
        exerciseFive.add(new StrengthExercise("Single leg drop",55,15,4,25,
                2, "Training mat and ankle weights"));
        exerciseFive.add(new BalanceExercise("Side plank twist",65,10,4,15,
                "Training mat"));
        exerciseFive.add(new EnduranceExercise("Mountain climbers",45,10,4,30,
                "Training mat"));
        x.sortExercise(exerciseFive);
        x.makeProgram(exerciseFive, programFive);


// Here we input the preferred exercises and intensity levels and assign them to "persons"
        Person personOne = new Person("endurance", 60, x);
        Person personTwo = new Person("balance", 60, x);
        Person personTree = new Person("strength",85 , x);
        Person personFour = new Person("endurance",80 , x);
        Person personFive = new Person("flexibility",20 , x);

        System.out.println( x.giveProgram(personOne));
        System.out.println( x.giveProgram(personTwo));
        System.out.println( x.giveProgram(personTree));
        System.out.println( x.giveProgram(personFour));
        System.out.println( x.giveProgram(personFive));
    }

}


