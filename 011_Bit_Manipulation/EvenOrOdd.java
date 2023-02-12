public class EvenOrOdd{
    public static void EvenOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String args[]){
        EvenOdd(3);
        EvenOdd(4);
    }
}
