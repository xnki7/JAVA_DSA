import java.util.*;
public class S005_Q5_Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of year you want to check whether it is a leap year or not");
        int year = sc.nextInt();
        if((year%4 == 0 && year%100 != 0)||year%400==0){
            System.out.println("Yes, it is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
}