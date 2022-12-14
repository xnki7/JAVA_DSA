/*
Print the following butterfly pattern:

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

*/

public class Q6_Butterfly{
    public static void triangle(int rows){
        // 1st half
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j =1; j<=((rows-i)*2); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half -- to obtain mirror image -- invert the outer loop
        for(int i=rows; i>0 ; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j =1; j<=((rows-i)*2); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        triangle(4);
    }
}