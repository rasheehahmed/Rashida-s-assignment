public class lap1_Q3 {


    public static void main(String[] args) {
        long n = 15;
        long m = 3;

        boolean isNMultipleOfM = isMultiple(n, m);
        System.out.println( isNMultipleOfM);
    }

    public static boolean isMultiple(long n, long m) {
        if (m == 0) {
            return false;
        }

        return n % m == 0;
    }
}
