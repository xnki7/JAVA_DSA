// QUESTION - Write a program to print the reverse of a number entered by user.

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int n = sc.nextInt();
        System.out.print("Reversed number is: ");
        while(n>0){
            int last_no = n%10;
            System.out.print(last_no);
            n = n/10;
        }
    }
}
