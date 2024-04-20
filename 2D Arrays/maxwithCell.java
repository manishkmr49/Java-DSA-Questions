public class maxwithCell {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Cell maxCell = findMaxNumberWithIndex(array);
        System.out.println("Maximum number in the 2D array is: " + maxCell.value);
        System.out.println("It is located at row: " + maxCell.row + ", column: " + maxCell.column);
    }

    public static Cell findMaxNumberWithIndex(int[][] arr) {
        Cell maxCell = new Cell(Integer.MIN_VALUE, -1, -1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxCell.value) {
                    maxCell.value = arr[i][j];
                    maxCell.row = i;
                    maxCell.column = j;
                }
            }
        }

        return maxCell;
    }

    static class Cell {
        int value;
        int row;
        int column;

        Cell(int value, int row, int column) {
            this.value = value;
            this.row = row;
            this.column = column;
        }
    }
}
