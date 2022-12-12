/*
Print the following pattern:

****
***
**
*

*/

import java.util.*;
public class p2_pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        for(int i =1; i<=4; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    } 
    
}
