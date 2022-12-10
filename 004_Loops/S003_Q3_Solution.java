import java.util.*;
public class S003_Q3_Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter the number of which you want to find the factorial of");
        int num = sc.nextInt();
        for(int i = num ; i>0 ; i-- ){
            factorial = factorial*i;
        }
        System.out.println("Hence the factorial of "+num+" is "+factorial );
    }
}