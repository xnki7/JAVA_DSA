import java.util.*;
public class S004_Q4_Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get it's table printed");
        int num = sc.nextInt();
        System.out.println("Hence the table of "+num+" is:" );
        for(int i = 1; i<=10; i++ ){
            System.out.print(num * i + " ");
        }
    }
}