public class powerOf2 {
    public static boolean IsPowerOfTwo(int n){
        if((n&(n-1)) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(IsPowerOfTwo(9));
    }
}
