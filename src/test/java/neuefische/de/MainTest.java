package neuefische.de;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void add_when3Plus3_thenReturn6() {
        // GIVEN
        int a = 3;
        int b = 3;
        int expected = a + b;
        // WHEN
        int actual = Main.add(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isEven_whenNumberIsOdd_thenReturnFalse() {
        // GIVEN
        int a = 5;
        // WHEN
        boolean actual = Main.isEven(a);
        // THEN
        assertFalse(actual);
    }

    @org.junit.jupiter.api.Test
    void isEven_whenNumberIsEven_thenReturnTrue() {
        // GIVEN
        int a = 6;
        // WHEN
        boolean actual = Main.isEven(a);
        // THEN
        assertTrue(actual);
    }

    @org.junit.jupiter.api.Test
    void calcProduct_when3times3_thenReturn9() {
        // GIVEN
        int a = 3;
        int b = 3;
        int expected = a * b;
        // WHEN
        int actual = Main.calcProduct(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void string_toUppercase_whenWhYiSThIsSoWeIrD_thenReturnWHYISTHISSOWEIRD() {
        // GIVEN
        String test = "WhYiSThIsSoWeIrD";
        String expected = "WHYISTHISSOWEIRD";
        // WHEN
        String actual = Main.string_toUppercase(test);
        // THEN
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isPositive_whenPositiveInt_thenReturnTrue() {
        // GIVEN
        int a = 42;
        // WHEN
        boolean actual = Main.isPositive(a);
        // THEN
        assertTrue(actual);
    }
    @org.junit.jupiter.api.Test
    void isPositive_whenNegativeInt_thenReturnFalse() {
        // GIVEN
        int a = -42;
        // WHEN
        boolean actual = Main.isPositive(a);
        // THEN
        assertFalse(actual);
    }
    @org.junit.jupiter.api.Test
    void isPositive_whenZero_thenReturnTrue() {
        // GIVEN
        int a = 0;
        // WHEN
        boolean actual = Main.isPositive(a);
        // THEN
        assertTrue(actual);
    }
}