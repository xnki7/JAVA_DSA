// QUESTION - Write a program to reverse a number.

class HelloWorld {
    public static void main(String[] args) {
        int n = 4321;
        int rev = 0;
        System.out.print("Reversed number is: ");
        while(n>0){
            int last_no = n%10;
            rev = (rev*10) + last_no;
            n = n/10;
        }
        n= rev;
        System.out.println(n);
    }
}
