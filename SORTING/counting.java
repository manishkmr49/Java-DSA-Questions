public class counting {
    public static void countingSort(int arr[]) {
        // Find out the largest value in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int original = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[original] = i;
                original++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);

        // Print the sorted array
        for (int sort : arr) {
            System.out.print(sort + " ");
        }
    }
}
