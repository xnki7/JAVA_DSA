// Write a Java method to convert decimal number to binary number.

public class S007_Q7_Solution{
    public static int dec2bin(int n){
        int num = 0;
        while(n>0){
            int rem = n%2;
            num = num*10 + rem;
            n = n/2;
        }
        return num;
    }
    public static void main(String args[]){
        System.out.println(dec2bin(5));
        System.out.println(dec2bin(7));
    }
}