import HomeWorkOutPlan.EnduranceExercise;
import HomeWorkOutPlan.Exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EnduranceExerciseTest {
    Exercise EnduranceExerciseTest  = new EnduranceExercise("Intervals", 90, 5, 4, 3, "Timer");

    @org.junit.Test
    public void EnduranceETest(){
        assertTrue(EnduranceExerciseTest.getName().contains("Intervals"));
        System.out.println("Name test: ");
        assertEquals(90, EnduranceExerciseTest.getIntensity());
        System.out.println("Intensity test: ");
        assertEquals(5, EnduranceExerciseTest.getDuration());
        System.out.println("Duration test: ");
        assertEquals(4, EnduranceExerciseTest.getRepetitions());
        System.out.println("Repetitions test: ");
        assertEquals(3, EnduranceExerciseTest.getSets());
        System.out.println("Sets test: ");
        assertTrue(EnduranceExerciseTest.toString().contains("Timer"));
        System.out.println("Equipment test: ");
    }
    @org.junit.Test
    public void testToString() {
        assertTrue(EnduranceExerciseTest.toString().toLowerCase().contains("endurance exercise"));
        System.out.println("toString test: ");
    }
}

