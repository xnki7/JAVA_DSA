// Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

public class S002_Q2_Solution{
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(isEven(5));
        System.out.println(isEven(6));
    }
}