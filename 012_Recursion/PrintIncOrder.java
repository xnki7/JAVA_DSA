//print numbers from 1 to n in increasing order
public class PrintIncOrder{
    public static void printnums(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        else{
            printnums(n-1);
            System.out.println(n);
        }
    }
    public static void main(String args[]){
        printnums(10);
    }
}
