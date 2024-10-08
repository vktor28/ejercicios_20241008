import org.junit.Test;
import static org.junit.Assert.*;


public class AssertionExamplesTest {

    private static MathOperations mathOperations = new MathOperations();

    // assertEquals
    @Test
    public void testAssertEquals() {
        int expected = 5;
        int actual = mathOperations.add(2, 3);
        assertEquals(expected, actual);
    }

    // assertNotEquals
    @Test
    public void testAssertNotEquals() {
        int expected = 5;
        int actual = mathOperations.add(2, 2);
        assertNotEquals(expected, actual);
    }

    // assertTrue
    @Test
    public void testAssertTrue() {
        int number = 10;
        assertTrue(mathOperations.isPositive(number));
    }

    // assertFalse
    @Test
    public  void testAssertFalse() {
        int number = -5;
        assertFalse(mathOperations.isPositive(number));
    }

    // assertNull
    @Test
    public void testAssertNull() {
        String str = null;
        assertNull(str);
    }

    // assertNotNull
    @Test
    public void testAssertNotNull() {
        String str = mathOperations.getHello();
        assertNotNull(str);
    }

    // assertArrayEquals
    @Test
    public void testAssertArrayEquals() {
        int[] expectedArray = {1, 2, 3};
        int[] actualArray = mathOperations.getArray();
        assertArrayEquals(expectedArray, actualArray);
    }

    // assertSame
    @Test
    public void testAssertSame() {
        String text = mathOperations.getHello();
        String reference = text;
        assertSame(text, reference);
    }

    // assertNotSame
    @Test
    public void testAssertNotSame() {
        String text1 = mathOperations.getHello();
        String text2 = mathOperations.getHelloString();
        assertNotSame(text1, text2);
    }

    // assertThrows
    @Test
    public void testAssertThrows() {
        assertThrows(ArithmeticException.class, mathOperations::throwArithmeticException);
    }

    // assertEsPAr
    @Test
    public void esNumeroPar() {
        int numero = 8;
        assertTrue(mathOperations.esPar(numero));    }

}