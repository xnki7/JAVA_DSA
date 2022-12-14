/*
Print the following pattern:

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

public class Q3_Inverted_half_pyramid_withNum{
    public static void pyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i+1); j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pyramid(5);
    }
}
