import java.util.*;
public class S001_Q1_Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number that you want to check whether it's negative or positive");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("It is a positive number");
        }
        else if(n == 0){
            System.out.println("It is zero");
        }
        else{
            System.out.println("It is a negative number");
        }
    }
}