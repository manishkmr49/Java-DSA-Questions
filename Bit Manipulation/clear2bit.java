public class clear2bit {
   public static int Clear2IthBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
   }
    public static void main(String[] args) {
    System.out.println(Clear2IthBit(15, 2));
   } 
}
 