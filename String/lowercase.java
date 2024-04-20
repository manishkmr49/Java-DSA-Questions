public class lowercase {
    
    public static String ToLowercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toLowerCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;

                sb.append(Character.toLowerCase(str.charAt(i)));
            }

            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Hi, I Am Manish Patel";
        System.out.println(ToLowercase(str));
    }
}
