import java.util.*;
public class S002_Q2_Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int even_sum = 0;
        int odd_sum = 0;

        do{
            System.out.println("Enter the number");
            number = sc.nextInt();

            if(number%2 == 0){
                even_sum = number + even_sum;
            }
            else{
                odd_sum = number + odd_sum;
            }

            System.out.println("Do you want to continue? press 1 for yes and 0 for no");
            choice = sc.nextInt();
        } while(choice==1);

        System.out.println("Sum of even numbers is " + even_sum);
        System.out.println("Sum of odd numbers is " + odd_sum);
    }
}