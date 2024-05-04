public class CountSetBit {
   public static int CountSetBitOfNumber(int n){
    int count =0 ;
    while(n > 0){
        if((n & 1) !=0) //checkour LSB
        {
            count++;
        }
         n = n>>1;
    }
        return count;
   }
    public static void main(String[] args) {
        System.out.println(CountSetBitOfNumber(15));
    }
}
