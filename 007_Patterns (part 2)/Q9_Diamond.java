/*
Print the following pattern:

   *   
  ***
 *****
*******
*******
 *****
  ***
   *

*/

public class Q9_Diamond{
    public static void Diamond(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=rows; i>0; i--){
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Diamond(4);
    }
}