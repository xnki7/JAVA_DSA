// QUESTION - Write a program to whether a number is prime or not.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();
        boolean isprime = true;
        if(num == 2){
            System.out.println(num + " is prime");
        }
        else{
            for(int i = 2; i<Math.sqrt(num) ; i++){ //can use num also
            if(num%i == 0){
                isprime = false;
            }
        }
        if(isprime==true){
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num + " is not prime");
        }
        }
        
    }
}
