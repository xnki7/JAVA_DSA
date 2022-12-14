/*
Print the following pattern:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

public class Q4_Floyds_triangle{
    public static void F_triangle(int rows){
        int k =1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        F_triangle(5);
    }
}