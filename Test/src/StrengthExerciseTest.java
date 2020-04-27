import HomeWorkOutPlan.Exercise;
import HomeWorkOutPlan.StrengthExercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StrengthExerciseTest {
    Exercise StrengthExerciseTest  = new StrengthExercise("Bicep curls", 50, 15, 12, 3, 10, "Rocks");

    @org.junit.Test
    public void strengthETest(){
        assertTrue(((StrengthExercise) StrengthExerciseTest).getName().contains("Bicep curls"));
        System.out.println("Name test: ");
        assertEquals(50, StrengthExerciseTest.getIntensity());
        System.out.println("Intensity test: ");
        assertEquals(15, StrengthExerciseTest.getDuration());
        System.out.println("Duration test: ");
        assertEquals(3, StrengthExerciseTest.getRepetitions());
        System.out.println("Repetitions test: ");
        assertEquals(12, StrengthExerciseTest.getSets());
        System.out.println("Sets test: ");
        assertEquals(10, ((StrengthExercise) StrengthExerciseTest).getWeights());
        System.out.println("Weights test: ");
        assertTrue(((StrengthExercise) StrengthExerciseTest).getEquipment().contains("Rocks"));
        System.out.println("Equipment test: ");
    }

    @org.junit.Test
    public void testToString() {
        assertTrue(StrengthExerciseTest.toString().toLowerCase().contains("strength exercise"));
        System.out.println("toString test: ");
    }
}


