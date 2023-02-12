public class ClearLast_i_Bits{
    public static void ClearLastIBits(int n, int i){
        int bitmask = (~0)<<i;
        System.out.println(n & bitmask);
    }
    public static void main(String args[]){
        ClearLastIBits(15, 2);
    }
}
