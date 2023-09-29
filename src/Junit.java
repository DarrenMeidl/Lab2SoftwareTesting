public class Junit {
    //add2Nums
    public int add2Nums(int a, int b){
        return  a + b;
    }
    //sumDouble
    public int sumDouble(int a, int b){
        if (a == b){
            return (a + b) * 2;
        }
        return a + b;
    }
    //sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation){
        if (weekday == false || vacation == true){
            return true;
        }
        else if (weekday == true || vacation == false){
            return false;
        }
        return false;
    }
}
