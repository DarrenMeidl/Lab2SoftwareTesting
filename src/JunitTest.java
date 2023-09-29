import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {
    //add2Nums Method Tests
    /*@Test
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
    }*/

    //sumDouble Method Tests
    @Test
    void fivePlusSixEqualsEleven(){
        System.out.println("TEST 1: 5 + 6");
        int num1 = 5;
        int num2 = 6;
        Junit j = new Junit();
        int expected = 11;
        int actual = j.sumDouble(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void sixPlusSixEqualsTwentyFour(){
        System.out.println("TEST 2: 6 + 6");
        int num1 = 6;
        int num2 = 6;
        Junit j = new Junit();
        int expected = 24;
        int actual = j.sumDouble(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void minusSixPlusSixEqualsZero(){
        System.out.println("TEST 3: -6 + 6");
        int num1 = -6;
        int num2 = 6;
        Junit j = new Junit();
        int expected = 0;
        int actual = j.sumDouble(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void minusEightPlusMinusEightEqualsMinusSixteen(){
        System.out.println("TEST 4: -8 + -8");
        int num1 = -8;
        int num2 = -8;
        Junit j = new Junit();
        int expected = -32;
        int actual = j.sumDouble(num1, num2);
        assertEquals(expected, actual);
    }

}