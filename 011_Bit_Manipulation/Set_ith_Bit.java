public class Set_ith_Bit{
    public static void setIthBit(int n, int i){
        int bitmask = 1<<i;
        System.out.println((n|bitmask));
    }
    public static void main(String args[]){
        setIthBit(10, 2);
        setIthBit(9, 2);
    }
}
