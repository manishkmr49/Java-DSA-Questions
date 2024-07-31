public class PowerCalculator {

    // Recursive method to calculate x^n
    public static double power(double x, int n) {
        // Base case: n == 0
        if (n == 0) {
            return 1;
        }
        
        // If n is negative, calculate positive power and take reciprocal
        if (n < 0) {
            return 1 / power(x, -n);
        }
        
        // Recursive case: x^n = x * x^(n-1)
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        double x = 2.0; // Example base
        int n = 3;      // Example exponent

        System.out.println(x + " to the power of " + n + " is: " + power(x, n));
    }
}
