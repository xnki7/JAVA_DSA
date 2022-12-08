import java.util.*;

public class S002_Q2_solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side of the square.");
        int side = sc.nextInt();
        System.out.println("Hence the area of the square is :");
        int area = (side * side);
        System.out.println(area);
    }
}