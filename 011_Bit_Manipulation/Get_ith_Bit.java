public class Get_Ith_bit{
    public static void ithBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            System.out.println("ith bit is 0");
        }
        else{
            System.out.println("ith bit is 1");
        }
    }
    public static void main(String args[]){
        ithBit(15, 2);
        ithBit(2, 0);
    }
}
