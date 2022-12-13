// Write a Java program to check if a number is a palindrome in Java.

public class S003_Q3_Solution{
    public static boolean checkpalin(int n){
        int num = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = 10*rev + rem;
            n = n/10;
        }
        if(rev == num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(checkpalin(123));
        System.out.println(checkpalin(121));
    }
}