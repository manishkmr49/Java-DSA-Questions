public class FirstOccurrence {

    public static int findFirstOccurrence(int[] array, int value) {
        return findFirstOccurrenceRecursive(array, value, 0);
    }

    private static int findFirstOccurrenceRecursive(int[] array, int value, int index) {
        // Base case: if index is out of bounds, return -1
        if (index >= array.length) {
            return -1;
        }
        // Check if the current element matches the value
        if (array[index] == value) {
            return index;
        }
        // Recursive case: check the next index
        return findFirstOccurrenceRecursive(array, value, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 4, 10};
        int valueToFind = 4;
        
        int result = findFirstOccurrence(array, valueToFind);
        
        if (result != -1) {
            System.out.println("The first occurrence of " + valueToFind + " is at index: " + result);
        } else {
            System.out.println(valueToFind + " is not present in the array.");
        }
    }
}
