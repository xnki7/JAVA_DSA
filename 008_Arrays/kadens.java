//Implement kaden's algorithm to find maximum subarray sum.

import java.util.*;
public class kadens{
    public static void kaden(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currsum = currsum + arr[i];
            if(currsum<0){
                currsum = 0;
            }
            if(currsum>maxsum){
                maxsum = currsum;
            }
        }
        System.out.println("Maximum subarray sum is "+ maxsum);
    }
    public static void main(String args[]){ 
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kaden(arr);
    }
}