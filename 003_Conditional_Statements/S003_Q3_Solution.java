import java.util.*;
public class S003_Q3_Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number from 1-7");
        int week_no = sc.nextInt();

        switch(week_no){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thrusday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Invalid input! please enter number between 1-7");
        }
    }
}