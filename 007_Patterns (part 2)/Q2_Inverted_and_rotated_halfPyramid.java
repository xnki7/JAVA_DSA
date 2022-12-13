/*
Print the following pattern:

   *
  **
 ***
****

*/

public class Q2_Inverted_and_rotated_halfPyramid{
    public static void pyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows -i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pyramid(4);
    }
}