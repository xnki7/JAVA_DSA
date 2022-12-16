//Write a program to find smallest and largest number in an array.

import java.util.*;
public class largest_smallest_num_in_array{
    public static void get_nums(int array[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]>largest){
                largest = array[i];
            }
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        System.out.println("Largest number is "+ largest);
        System.out.println("Smallest number is "+ smallest);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        get_nums(arr);
    }
}