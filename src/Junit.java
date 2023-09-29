public class Junit {
    //add2Nums EXAMPLE
    public int add2Nums(int a, int b){
        return  a + b;
    }

    //sumDouble Q1
    public int sumDouble(int a, int b){
        if (a == b){
            return (a + b) * 2;
        }
        return a + b;
    }

    //sleepIn Q2
    public boolean sleepIn(boolean weekday, boolean vacation){
        if (weekday == false || vacation == true){
            return true;
        }
        else if (weekday == true || vacation == false){
            return false;
        }
        return false;
    }

    //monkeyTrouble Q3
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if (aSmile == bSmile){
            return true;
        }
        else if (aSmile != bSmile){
            return false;
        }
        return false;
    }

    //sleepIn Q4
    public int sleepInInt(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == true) {
            return 1;
        } else if (weekday == true && vacation == false) {
            return 2;
        } else if (weekday == false && vacation == true) {
            return 3;
        } else if (weekday == false && vacation == false) {
            return 4;
        }
        return 37;
    }

    //love6 Q5
    public boolean love6(int a, int b){
        if (a == 6 || b == 6){
            return true;
        }
        else if (a + b == 6 || a - b == 6){
            return true;
        }
        else {
            return false;
        }
    }
}
