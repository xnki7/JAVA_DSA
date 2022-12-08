import java.util.*;

public class S001_Q1_solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        System.out.println("Hence the average of a, b, c is");
        int average = (a + b + c)/3;
        System.out.println(average);
    }
}