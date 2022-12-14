/*
Print the following pattern:

12345
1234
123
12
1

*/

public class Q3_Inverted_half_pyramid_withNum{
    public static void pyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i+1); j++){
                System.out.print(j);
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pyramid(5);
    }
}