public class Linear_search{
    public static int linear_s(int array[], int key){
        for(int i=0; i<array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int index = linear_s(arr, 7);

        if(index==-1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Key found at index = "+ index);
        }
    }
}