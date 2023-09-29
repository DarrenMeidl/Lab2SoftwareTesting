public class Junit {
    //add2Nums
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
        if (aSmile == true && bSmile == true){
            return true;
        }
        else if (aSmile == false && bSmile == false){
            return true;
        }
        return true;
    }
}
