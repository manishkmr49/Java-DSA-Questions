public class Insertion {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than curr, to one position ahead of their current position
            while(j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr; // Insert curr into the correct sorted position
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);

        // Print sorted array
        for (int sort : arr) {
            System.out.print(sort + " ");
        }
    }
}
