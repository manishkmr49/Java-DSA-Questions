public class LastOccurrence {

    public static int FindLastOccurrence(int arr[], int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FindLastOccurrence(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        int N = arr.length;
        System.out.println(FindLastOccurrence(arr, key, N-1));
    }
}
