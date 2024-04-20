public class SelectionSort {
    
    public static void selectionSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                // Compare 
                if (arr[j] < arr[minPos]) {
                    //update the min Position
                    minPos = j;
                }
            }
            //swap only if minPos has changed
            if (minPos != i) {
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }
         // Print sorted array
        for (int sort : arr) {
            System.out.print(sort + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]= {5,4,1,3,2};
        selectionSorting(arr);
        
    }
}
