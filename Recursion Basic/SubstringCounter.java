public class SubstringCounter {

    // Main function to calculate the count of substrings
    public static int countSubstrings(String S) {
        return countSubstringsHelper(S, 0, S.length() - 1) + S.length();
    }

    // Helper function to calculate the count of substrings recursively
    private static int countSubstringsHelper(String S, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int count = 0;
        if (S.charAt(start) == S.charAt(end)) {
            count = 1;
        }

        return count 
                + countSubstringsHelper(S, start + 1, end) 
                + countSubstringsHelper(S, start, end - 1) 
                - countSubstringsHelper(S, start + 1, end - 1);
    }

    // Main function to run the program
    public static void main(String[] args) {
        String S1 = "abcab";
        String S2 = "aba";
        
        System.out.println("Count of substrings in S1: " + countSubstrings(S1)); // Output: 7
        System.out.println("Count of substrings in S2: " + countSubstrings(S2)); // Output: 4
    }
}
