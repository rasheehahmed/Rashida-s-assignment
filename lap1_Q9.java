public class lap1_Q9 {
    public static void main(String[] args) {
        String s = "Let’s try, Mike!";
        String result = removePunctuation(s);
        System.out.println( s);
        System.out.println(result);
    }
    public static String removePunctuation(String s) {
        StringBuilder w = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                w.append(c);
            }
        }
        return w.toString();
    }


}
