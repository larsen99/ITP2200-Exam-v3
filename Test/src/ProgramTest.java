import HomeWorkOutPlan.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class ProgramTest {

    ArrayList<Exercise> exercises = new ArrayList<>();
    Exercise enduranceTest = new EnduranceExercise("Exercise one",5,2,1,2,"none");
    Exercise enduranceTest2 = new EnduranceExercise("Exercise two", 10,1,2,1,"none2");
    Exercise strengthExercise = new StrengthExercise("", 1,10,1,5,3,"none3");
    Exercise flexibilityExercise = new FlexibilityExercise("", 5,4,2,5,"none4");
    Exercise balanceExercise = new BalanceExercise("", 10,3,2,5,"none5");

    Program programTest = new Program();
    Program p = new Program();
    Person personTest;

    @Test
    public void overallIntensityTest(){
        //testing to see if intensity level is zero before adding exercises.
        assertEquals(programTest.getIntensity(), 0);

        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.setExerciseList(exercises);
        programTest.getIntensity();

//testing to see if intensity level has changed from zero. here we want 2 as a result,
// endurance2 has intensity 2, while endurance1 has intensity 1, so intensity should be 2

        assertEquals(programTest.getIntensity(), 2);
        System.out.println(programTest.getIntensity()  + " = should be 2");
    }
    @Test
    public void isProgramBalancedTest(){
        //checking if the program is balanced before adding exercises
        assertFalse(programTest.isBalanced());

        //adding exercises of all four types
        exercises.add(enduranceTest);
        exercises.add(strengthExercise);
        exercises.add(flexibilityExercise);
        exercises.add(balanceExercise);

        //checking to see if program is balanced.
        programTest.setExerciseList(exercises);
        assertTrue(programTest.isBalanced());
    }

    @Test
    public void sortExerciseTest() {
        Exercise e1 = new BalanceExercise("3", 1, 2, 4, 5, "");
        Exercise e2 = new FlexibilityExercise("3", 4, 2, 4, 5, "");
        Exercise e3 = new EnduranceExercise("3", 9, 2, 4, 5, "");
        Exercise e4 = new StrengthExercise("3", 3, 2, 4, 5, 5, "");

        ArrayList<Exercise> ovelser = new ArrayList<>();
        ovelser.add(e1);
        ovelser.add(e2);
        ovelser.add(e3);
        ovelser.add(e4);

        assertEquals(1, ovelser.get(0).getIntensity());
        System.out.println("Index 0 is intensity 1 before sorting");
        assertEquals(4, ovelser.get(1).getIntensity());
        System.out.println("Index 1 is intensity 4 before sorting");
        assertEquals(9, ovelser.get(2).getIntensity());
        System.out.println("Index 2 is intensity 9 before sorting");
        assertEquals(3, ovelser.get(3).getIntensity());
        System.out.println("Index 3 is intensity 3 before sorting");
        System.out.println("");

//If you want to see the unsorted list of exercise after intensity you can remove the comment of the code below
//System.out.println("These are the unsorted exercises : \n" + ovelser);
        Program p = new Program();
        p.sortExercise(ovelser);
        assertEquals(1, ovelser.get(0).getIntensity());
        System.out.println("Index 0 is intensity 1 after sorting");
        assertEquals(3, ovelser.get(1).getIntensity());
        System.out.println("Index 1 is intensity 3 after sorting");
        assertEquals(4, ovelser.get(2).getIntensity());
        System.out.println("Index 2 is intensity 4 after sorting");
        assertEquals(9, ovelser.get(3).getIntensity());
        System.out.println("Index 3 is intensity 9 after sorting");
    }

    @Test
    public void CalculateDurationTest(){
        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.setExerciseList(exercises);
        int totalDuration = (enduranceTest.getDuration()+enduranceTest2.getDuration())*2;
        assertEquals(programTest.calculateDuration(), "This program takes "+totalDuration+ " minutes from start to finish");
    }

    @Test
    public void makeProgramTest(){
        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.setExerciseList(exercises);
        assertTrue (programTest.getExerciseList().contains(enduranceTest));
        assertTrue (programTest.getExerciseList().contains(enduranceTest2));
    }

    @Test
    public void doesProgramFitTest(){
        exercises.add(enduranceTest);
        exercises.add(enduranceTest2);
        programTest.setExerciseList(exercises);
        System.out.println(programTest.getIntensity());
        personTest = new Person("endurance", 2,p);
        assertTrue(p.doesProgramFit(personTest,programTest));
        Person personTest2 = new Person("Swimming", 30, p);
        assertFalse(p.doesProgramFit(personTest2,programTest));
    }
    @Test
    public void giveProgramIsProgramEmptyTest(){
        Person personTest = new Person("balance", 50,programTest);
        assertFalse(personTest.getCurrentProgram().getExerciseList().contains(balanceExercise));
    }
    @Test
    public void giveProgramNoProgramForYou(){
        Person personTest = new Person("balance", 50, p);
        p.giveProgram(personTest);
        // String lookup is hell.
        assertEquals("sorry, we can not find an appropriate program for you.", p.giveProgram(personTest).toLowerCase());
    }
    @Test
    public void giveProgramIsCorrectExercisesIncludedTest() {
        Person personTest = new Person("balance", 50,programTest);
        exercises.add(enduranceTest);
        exercises.add(flexibilityExercise);
        exercises.add(strengthExercise);
        exercises.add(balanceExercise);
        p.setExerciseList(exercises);
        p.makeProgram(exercises, programTest);
        p.giveProgram(personTest);

        assertTrue(personTest.getCurrentProgram().getExerciseList().contains(balanceExercise));
        assertTrue(personTest.getCurrentProgram().getExerciseList().contains(strengthExercise));
        assertTrue(personTest.getCurrentProgram().getExerciseList().contains(flexibilityExercise));
        assertTrue(personTest.getCurrentProgram().getExerciseList().contains(enduranceTest));
        assertFalse(personTest.getCurrentProgram().getExerciseList().contains(enduranceTest2));
    }
    @Test
    public void giveProgramIsAssumedProgramAssignedTest() {
        exercises.add(enduranceTest);
        exercises.add(flexibilityExercise);
        exercises.add(strengthExercise);
        exercises.add(balanceExercise);
        p.setExerciseList(exercises);
        p.makeProgram(exercises, programTest);

        Person personTest2 = new Person("balance", 5, p);
        p.giveProgram(personTest2);
        assertEquals(p.giveProgram(personTest2), String.format("You will get this following program, matching your requirements:\n" +
                        "Intensity level is : %d%%\n" +
                        "Your preferred intensity: %d%%\n" +
                        "%s",
                personTest2.getCurrentProgram().getIntensity(), personTest2.getAcceptableIntensity(),
                personTest2.getCurrentProgram().getExerciseList().toString()));
    }
}
