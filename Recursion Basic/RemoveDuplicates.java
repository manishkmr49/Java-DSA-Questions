public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "aabbccddeeff";
        String result = removeDuplicates(input, "");
        System.out.println(result);  // Output: "abcdef"
    }

    public static String removeDuplicates(String str, String seen) {
        // Base case: if the original string is empty, return the helper string
        if (str.isEmpty()) {
            return seen;
        }

        // Recursive case
        char currentChar = str.charAt(0);
        if (seen.indexOf(currentChar) == -1) {
            // If the current character is not in 'seen', add it and recurse
            return removeDuplicates(str.substring(1), seen + currentChar);
        } else {
            // If the current character is already in 'seen', just recurse
            return removeDuplicates(str.substring(1), seen);
        }
    }
}
