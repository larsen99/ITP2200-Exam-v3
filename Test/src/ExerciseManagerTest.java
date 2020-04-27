import HomeWorkOutPlan.*;

import java.util.ArrayList;
import HomeWorkOutPlan.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ExerciseManagerTest {

            ArrayList<Exercise>exercise=new ArrayList<>();
            ArrayList<Exercise>exercisesTwo=new ArrayList<>();

            Exercise StrengthExerciseTestAnotherClass = new StrengthExercise("Jumping jacks",50,10,4,30,2, "Training mat and ankle weights");
            Exercise EnduranceExerciseTestAnotherClass = new EnduranceExercise("Jogging intervals",70,30,4,4,"Stop watch and running shoes");
            Exercise FlexibilityExerciseTestAnotherClass = new FlexibilityExercise("Split stretches",25,10,3,1,"have to be able to do a split");
            Exercise BalanceExerciseTestAnotherClass = new BalanceExercise("Toe raises",40,10,4,25,"Balance pad");

            Exercise e1 = new StrengthExercise("Leg drop",60,12,4,20,2,"Strength e. test");
            Exercise e2 = new StrengthExercise("Dead lift",60,15,3,7,40,"Strength e. test");
            Exercise e3 = new StrengthExercise("Hip thrust",60,12,3, 20,10,"Strength e. test");
            Exercise e4 = new StrengthExercise("Rows",60,12,3,12,20,"Strength e. test");

            Program x = new Program();
            Program programTestAnotherClass=new Program();
            Program programTestTwo = new Program();

            Person personTestTwo = new Person("strength", 50, x);
            Person personTestingTwo =new Person ("strength",70, x);

            //Checking the communication between classes and that every method is behaving as we want it to
            @org.junit.Test
            public void IntegrationTest () {
                assertFalse(programTestAnotherClass.isBalanced());
                System.out.println("Running a test to see if program is balanced");

                exercise.add(BalanceExerciseTestAnotherClass);
                exercise.add(StrengthExerciseTestAnotherClass);
                exercise.add(FlexibilityExerciseTestAnotherClass);
                exercise.add(EnduranceExerciseTestAnotherClass);

                exercisesTwo.add(e1);
                exercisesTwo.add(e2);
                exercisesTwo.add(e3);
                exercisesTwo.add(e4);

                x.makeProgram(exercisesTwo, programTestTwo);
                x.makeProgram(exercise, programTestAnotherClass);

                assertTrue(programTestAnotherClass.isBalanced());
                System.out.println("Running a test to see if program is balanced");
                assertFalse(programTestTwo.isBalanced());
                System.out.println("Running a test to see if program is balanced");
                assertEquals(programTestAnotherClass.getIntensity(), 70);
                assertTrue(programTestAnotherClass.getExerciseList().contains(BalanceExerciseTestAnotherClass));
                assertTrue(programTestAnotherClass.getExerciseList().contains(StrengthExerciseTestAnotherClass));

                assertEquals(programTestAnotherClass.getExerciseList().get(0).getIntensity(),40 );
                assertEquals(programTestAnotherClass.getExerciseList().get(1).getIntensity(),50 );
                assertEquals(programTestAnotherClass.getExerciseList().get(2).getIntensity(),25 );
                assertEquals(programTestAnotherClass.getExerciseList().get(3).getIntensity(),70 );
                System.out.println("Testing to se if exercises is unsorted");

                x.sortExercise(programTestAnotherClass.getExerciseList());

                assertEquals(programTestAnotherClass.getExerciseList().get(0).getIntensity(),25 );
                assertEquals(programTestAnotherClass.getExerciseList().get(1).getIntensity(),40 );
                assertEquals(programTestAnotherClass.getExerciseList().get(2).getIntensity(),50 );
                assertEquals(programTestAnotherClass.getExerciseList().get(3).getIntensity(),70 );
                System.out.println("Testing to se if exercises is sorted");

                assertTrue(programTestTwo.getExerciseList().contains(e1));
                assertTrue(programTestTwo.getExerciseList().contains(e2));
                assertTrue(programTestTwo.getExerciseList().contains(e3));
                assertTrue(programTestTwo.getExerciseList().contains(e4));
                System.out.println("Test to see if the correct Exercise is included");

                x.giveProgram(personTestTwo);
                assertSame(personTestTwo.getCurrentProgram(), x);
                assertNotSame(personTestTwo.getCurrentProgram(), programTestTwo);
                System.out.println("testing to see if correct program has been assigned");

                x.giveProgram(personTestingTwo);
                // can't get this to work vv
                assertEquals(x.giveProgram(personTestingTwo), String.format("You will get this following program, matching your requirements:\n" +
                                "Intensity level is : %d%%\n" +
                                "Your preferred intensity: %d%%\n" +
                                "%s",
                        personTestTwo.getCurrentProgram().getIntensity(), personTestTwo.getAcceptableIntensity(),
                        personTestTwo.getCurrentProgram().getExerciseList().toString()));

            }

        }





