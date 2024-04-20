public class ChangeCase {

    public static String changeLetter(String str) {
        StringBuilder result = new StringBuilder(str);

        for (int i = 0; i < result.length(); i++) {
            char currentChar = result.charAt(i);

            if (Character.isLowerCase(currentChar)) {
                char uppercaseChar = Character.toUpperCase(currentChar);
                result.setCharAt(i, uppercaseChar);
            } else {
                char lowercaseChar = Character.toLowerCase(currentChar);
                result.setCharAt(i, lowercaseChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "aBc CoD";
        System.out.println(changeLetter(str));
    }
}
