public class Bubble_sort{
    public static void bubble(int arr[]){
        for(int turn=0; turn <= (arr.length - 2); turn++){
            for(int j=0; j<=(arr.length -2 -turn); j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {7,6,5,4,3,2,1};
        bubble(arr);
    }
}