// Write a Java method to compute the sum of the digits in an integer.

public class S005_Q5_Solution{
    public static int sum_of_digits(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sum_of_digits(123));
        System.out.println(sum_of_digits(121));
    }
}