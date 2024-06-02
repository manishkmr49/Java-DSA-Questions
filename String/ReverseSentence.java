public class ReverseSentence {

    public static String reverseWords(String sentence) {
       
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String sentence = "I am from AEC";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }
}
