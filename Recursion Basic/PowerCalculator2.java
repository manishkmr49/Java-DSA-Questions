public class PowerCalculator2 {
    
    public static int OptimizePower(int x , int n){
        if( n == 0){
            return 1;
        }

        int halfPower = OptimizePower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //when n is odd
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    
    public static void main(String[] args) {
       int x = 2;
       int n = 5;
       System.out.println(OptimizePower(x,n));
    }

}
