public class SubArraySum {
    
    public static void findSubArraySums(int[] array) {
        int n = array.length;

        // Iterate through each element as starting point
        for (int i = 0; i < n; i++) {
            int sum = 0;

            // Iterate through each element from i to end
            for (int j = i; j < n; j++) {
                sum += array[j];
                
                System.out.println("Sum of subarray [" + i + "..." + j + "]: " + sum);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        findSubArraySums(array);
    }
}
