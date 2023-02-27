//print numbers from n to 1 in decreasing order
public class PrintDecOrder{
    public static void printnums(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        else{
            System.out.println(n);
            printnums(n-1);
        }
    }
    public static void main(String args[]){
        printnums(10);
    }
}
