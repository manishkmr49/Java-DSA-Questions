public class MaxNum {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxNumber = findMaxNumber(array);
        System.out.println("Maximum number in the 2D array is: " + maxNumber);
        
    }

    public static int findMaxNumber(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }

        return max;
    }
}
