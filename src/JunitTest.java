import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {

    @Test
    void twoPlusTwoEqualsFour() {
        System.out.println("Test 1 - 2 + 2");
        int num1 = 2;
        int num2 = 2;
        Junit j = new Junit();
        int expected = 4;
        int actual = j.add2Nums(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void fivePlusSixEqualsEleven() {
        System.out.println("Test 2 - 5 + 6");
        int num1 = 5;
        int num2 = 6;
        Junit j = new Junit();
        int expected = 11;
        int actual = j.add2Nums(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void threePlusMinusFiveEqualsMinusTwo() {
        System.out.println("Test 3 - 3 + -5");
        int num1 = 3;
        int num2 = -5;
        Junit j = new Junit();
        int expected = -2;
        int actual = j.add2Nums(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void minusFivePlusMinusSixEqualsMinusEleven() {
        System.out.println("Test 4 - -5 + -6");
        int num1 = -5;
        int num2 = -6;
        Junit j = new Junit();
        int expected = -11;
        int actual = j.add2Nums(num1, num2);
        assertEquals(expected, actual);
    }
}