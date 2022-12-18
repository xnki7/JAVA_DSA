import java.util.*;
public class Prefix_sum{
    public static void max_Subarray_sum(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(i==0){
                    currsum = prefix[j];
                }
                else{
                    currsum = prefix[j] - prefix[i-1];
                }

                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum = "+ maxsum);
    }
    public static void main(String args[]){
        int arr[] = {1,-2,3,-4,5};
        max_Subarray_sum(arr);   
    }
}

