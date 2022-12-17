// Write a program to implement binary search operation.

public class Binary_Search{
    public static int binary(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = (start + end)/2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int array[] = {2,4,6,8,10,12}; //Array must be sorted for binary search
        int index = binary(array, 10);
        System.out.println("found 10 at, Index = "+index);
    }
}