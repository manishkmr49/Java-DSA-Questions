public class TransposeMatrix {
    public static int[][] transposeMatrix(int[][] matrix) {
        
        // Get the dimensions of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        
        int[][] transposed = new int[cols][rows];

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, 
                           { 4, 5, 6 } };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        System.out.println("\nTransposed Matrix:");
        int[][] transposed = transposeMatrix(matrix);
        printMatrix(transposed);
    }
}
