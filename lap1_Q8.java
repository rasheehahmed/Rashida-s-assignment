public class lap1_Q8 {
    public static void main(String[] args) {

        String World = "Hello, World!";
        int vowelCount = countVowels(World);
        System.out.println(vowelCount);
    }

    public static int countVowels(String World) {

        if (World == null || World.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < World.length(); i++) {
            char c = World.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }

        return count;
    }
}
