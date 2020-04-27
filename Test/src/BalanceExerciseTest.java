import HomeWorkOutPlan.BalanceExercise;
import HomeWorkOutPlan.Exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BalanceExerciseTest {
    Exercise BalanceExerciseTest = new BalanceExercise("Squat", 50, 15, 25, 5, "No equipment");

    @org.junit.Test
    public void balanceETest(){
        assertTrue(BalanceExerciseTest.getName().contains("Squat"));
        System.out.println("Name test: ");
        assertEquals(50, BalanceExerciseTest.getIntensity());
        System.out.println("Intensity test: ");
        assertEquals(15, BalanceExerciseTest.getDuration());
        System.out.println("Duration test: ");
        assertEquals(5, BalanceExerciseTest.getRepetitions());
        System.out.println("Repetitions test: ");
        assertEquals(25, BalanceExerciseTest.getSets());
        System.out.println("Sets test: ");
        assertTrue(((BalanceExercise)BalanceExerciseTest).getEquipment().contains("No equipment"));
        System.out.println("Equipment test: ");
    }

    @org.junit.Test
    public void testToString() {
        assertTrue(BalanceExerciseTest.toString().toLowerCase().contains("balance exercise"));
        System.out.println(" toString test: ");
    }

}
