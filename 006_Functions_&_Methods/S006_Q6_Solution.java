// Write a Java method to convert binary number to decimal number.

public class S006_Q6_Solution{
    public static int bin2dec(int n){
        int num = 0;
        int i = 0;
        while(n>0){
            int rem = n%10;
            num = num + rem*(int)Math.pow(2,i);
            n = n/10;
            i++;
        }
        return num;
    }
    public static void main(String args[]){
        System.out.println(bin2dec(101));
        System.out.println(bin2dec(111));
    }
}