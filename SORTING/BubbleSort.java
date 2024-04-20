import java.util.*;

public class BubbleSort {
    
    public static void sorting(int arr[]) {
        int n = arr.length;
        
        for (int turn = 0; turn < n - 1; turn++) {
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        sorting(arr);
        printArr(arr);
    }
}
