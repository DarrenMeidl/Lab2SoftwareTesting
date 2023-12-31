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
    }







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
    void minusEightPlusMinusEightEqualsMinusThirtyTwo(){
        System.out.println("TEST 4: -8 + -8");
        int num1 = -8;
        int num2 = -8;
        Junit j = new Junit();
        int expected = -32;
        int actual = j.sumDouble(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void minusThreePlusMinusFiveEqualsMinusEight(){
        System.out.println("TEST 5: -3 + -5");
        int num1 = -3;
        int num2 = -5;
        Junit j = new Junit();
        int expected = -8;
        int actual = j.sumDouble(num1, num2);
        assertEquals(expected, actual);
    }







    //sleepIn Method Test
    @Test
    void weekdayTrueVacationFalse(){
        System.out.println("TEST 1: weekdayT, vacationF");
        boolean w = true;
        boolean v = false;
        Junit j = new Junit();
        boolean expected = false;
        boolean actual = j.sleepIn(w, v);
        assertEquals(expected, actual);
    }

    @Test
    void weekdayTrueVacationTrue(){
        System.out.println("TEST 2: weekdayT, vacationT");
        boolean w = true;
        boolean v = true;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.sleepIn(w, v);
        assertEquals(expected, actual);
    }

    @Test
    void weekdayFalseVacationTrue(){
        System.out.println("TEST 3: weekdayF, vacationT");
        boolean w = false;
        boolean v = true;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.sleepIn(w, v);
        assertEquals(expected, actual);
    }

    @Test
    void weekdayFalseVacationFalse(){
        System.out.println("TEST 4: weekdayF, vacationF");
        boolean w = false;
        boolean v = false;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.sleepIn(w, v);
        assertEquals(expected, actual);
    }





    //monkeyTrouble Method Tests
    @Test
    void aSmileTrueBSmileTrue(){
        System.out.println("TEST 1: aSmileT, bSmileT");
        boolean a = true;
        boolean b = true;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.monkeyTrouble(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void aSmileTrueBSmileFalse(){
        System.out.println("TEST 1: aSmileT, bSmileF");
        boolean a = true;
        boolean b = false;
        Junit j = new Junit();
        boolean expected = false;
        boolean actual = j.monkeyTrouble(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void aSmileFalseBSmileFalse(){
        System.out.println("TEST 1: aSmileF, bSmileF");
        boolean a = false;
        boolean b = false;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.monkeyTrouble(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void aSmileFalseBSmileTrue(){
        System.out.println("TEST 1: aSmileF, bSmileT");
        boolean a = false;
        boolean b = true;
        Junit j = new Junit();
        boolean expected = false;
        boolean actual = j.monkeyTrouble(a, b);
        assertEquals(expected, actual);
    }






    //sleepInInt Method Tests
    @Test
    void weekdayTrueVacationTrue(){
        System.out.println("TEST 1: weekdayT, vacationT");
        boolean w = true;
        boolean v = true;
        Junit j = new Junit();
        int expected = 1;
        int actual = j.sleepInInt(w, v);
        assertEquals(expected, actual);
    }
    @Test
    void weekdayTrueVacationFalse(){
        System.out.println("TEST 2: weekdayT, vacationF");
        boolean w = true;
        boolean v = false;
        Junit j = new Junit();
        int expected = 2;
        int actual = j.sleepInInt(w, v);
        assertEquals(expected, actual);
    }

    @Test
    void weekdayFalseVacationTrue(){
        System.out.println("TEST 3: weekdayF, vacationT");
        boolean w = false;
        boolean v = true;
        Junit j = new Junit();
        int expected = 3;
        int actual = j.sleepInInt(w, v);
        assertEquals(expected, actual);
    }
    @Test
    void weekdayFalseVacationFalse(){
        System.out.println("TEST 4: weekdayF, vacationF");
        boolean w = false;
        boolean v = false;
        Junit j = new Junit();
        int expected = 4;
        int actual = j.sleepInInt(w, v);
        assertEquals(expected, actual);
    }*/







    //love6 Method Tests
    @Test
    void aEqualsSixBEqualsSix(){
        System.out.println("TEST 1: a6, b6");
        int num1 = 6;
        int num2 = 6;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.love6(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void aEqualsSixBEqualsTwelve(){
        System.out.println("TEST 2: a6, b12");
        int num1 = 6;
        int num2 = 12;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.love6(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void aEqualsZeroBEqualsSix(){
        System.out.println("TEST 3: a0, b6");
        int num1 = 0;
        int num2 = 6;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.love6(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void aEqualsThreeBEqualsThree(){
        System.out.println("TEST 4: a3, b3");
        int num1 = 3;
        int num2 = 3;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.love6(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void aEqualsMinusThreeBEqualsMinusThree(){
        System.out.println("TEST 5: a-3, b-3");
        int num1 = -3;
        int num2 = -3;
        Junit j = new Junit();
        boolean expected = false;
        boolean actual = j.love6(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void aEqualsNineBEqualsThree(){
        System.out.println("TEST 6: a9, b3");
        int num1 = 9;
        int num2 = 3;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.love6(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void aEqualsNineBEqualsMinusThree(){
        System.out.println("TEST 7: a9, b-3");
        int num1 = 9;
        int num2 = -3;
        Junit j = new Junit();
        boolean expected = true;
        boolean actual = j.love6(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void aEqualsThreeBEqualsNine(){
        System.out.println("TEST 8: a3, b9");
        int num1 = 3;
        int num2 = 9;
        Junit j = new Junit();
        boolean expected = false;
        boolean actual = j.love6(num1, num2);
        assertEquals(expected, actual);
    }

}