import HomeWorkOutPlan.Exercise;
import HomeWorkOutPlan.FlexibilityExercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlexibilityExerciseTest {
    Exercise FlexibilityExerciseTest  = new FlexibilityExercise("Standing hamster stretch", 25, 30, 10, 3, "To be flexible in legs");

    @org.junit.Test
    public void flexibilityETest(){
        assertTrue(((FlexibilityExercise) FlexibilityExerciseTest).getName().contains("Standing hamster stretch"));

        System.out.println("Name test: ");
        assertEquals(25, FlexibilityExerciseTest.getIntensity());
        System.out.println("Intensity: ");
        assertEquals(30, FlexibilityExerciseTest.getDuration());
        System.out.println("Duration test: ");
        assertEquals(10, FlexibilityExerciseTest.getRepetitions());
        System.out.println("Repetitions test: ");
        assertEquals(3, FlexibilityExerciseTest.getSets());
        System.out.println("Sets test: ");
        assertTrue(((FlexibilityExercise) FlexibilityExerciseTest).getRequirement().contains("To be flexible in legs"));
        System.out.println("Requirement test: ");
    }

    @org.junit.Test
    public void testToString() {
        assertTrue(FlexibilityExerciseTest.toString().toLowerCase().contains("flexibility exercise"));
        System.out.println("toString test: ");
    }
}