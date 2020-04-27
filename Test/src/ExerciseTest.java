import HomeWorkOutPlan.Exercise;
import HomeWorkOutPlan.StrengthExercise;
import org.junit.*;

import static org.junit.Assert.*;

public class ExerciseTest {
    Exercise e = new StrengthExercise("Pull ups",80,10,3,10,4,"Test Test");

    @Test
    public void ToStringTest() {
        assertTrue(e.toString().contains("e"));
        assertTrue(e.toString().contains("strength"));
    }
    @Test
    public void getIntensity() {
        assertEquals(80, e.getIntensity());
    }
    @Test
    public void compareTo() {
        assertTrue(e.compareTo(e) == 0);
    }

    /* We don't know how to test for the throw exception
    assertThrows in JUnit 5
    @Test
    void throwException() throws IllegalArgumentException {
        Exercise e3 = new StrengthExercise("101", 0,1,1,1,1, "");
        assertSame("Invalid intensity value", e3);
        assertTrue(e3.intensity == "Invalid intensity value");
    }*/

}
