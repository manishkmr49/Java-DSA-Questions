public class updatebit {
    public static int UpdateBit(int n, int i, int newBit){
        // Clear the ith bit of n
        int mask = ~(1 << i);
        n = n & mask;
        
        // Set the ith bit of n to newBit
        n = n | (newBit << i);
        
        return n;
    }
    
    public static void main(String[] args) {
        System.out.println(UpdateBit(10, 2, 1)); // Example usage
    }
}
