public class Selection_sort{
    public static void selection(int arr[]){
        for(int i = 0 ; i<= arr.length -2; i++){
            int minpos = i;
            for(int j = i+1 ; j<= arr.length-1; j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {7,6,5,4,3,2,1};
        selection(arr);
    }
}