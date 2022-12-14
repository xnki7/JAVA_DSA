/*
Print the following pattern:

    *****
   *   * 
  *   *
 *   *
*****

*/

public class Q8_Hollow_Rhombus{
    public static void H_rhombus(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=rows; j++){
                if(i==1 || i==rows || j==1 || j==rows ){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        H_rhombus(5);
    }
}