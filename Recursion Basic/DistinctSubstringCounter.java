public class DistinctSubstringCounter {

    // Main function to calculate the count of substrings with distinct characters
    public static int countDistinctSubstrings(String S) {
        return countDistinctSubstringsHelper(S, 0, S.length() - 1);
    }

    // Helper function to calculate the count of distinct substrings recursively
    private static int countDistinctSubstringsHelper(String S, int start, int end) {
        if (start > end) {
            return 0;
        }

        // Calculate the total substrings with distinct characters starting from the current start
        int count = 0;
        boolean[] visited = new boolean[256]; // To track if a character is already in the substring

        for (int i = start; i <= end; i++) {
            if (visited[S.charAt(i)]) {
                break;
            }
            visited[S.charAt(i)] = true;
            count++;
        }

        // Recurse for the rest of the string
        return count + countDistinctSubstringsHelper(S, start + 1, end);
    }

    // Main function to run the program
    public static void main(String[] args) {
        String S1 = "abc";
        String S2 = "aaa";
        
        System.out.println("Count of distinct substrings in S1: " + countDistinctSubstrings(S1)); // Output: 6
        System.out.println("Count of distinct substrings in S2: " + countDistinctSubstrings(S2)); // Output: 3
    }
}
