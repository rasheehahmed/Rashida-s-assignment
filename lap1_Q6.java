public class lap1_Q6 {
    public static void main(String[] args) {
        int n = 10;
        int oddSum = calculateOddSum(n);
        System.out.println( n + " is: " + oddSum);
    }
    public static int calculateOddSum(int n) {
        if (n <= 0) {
            return 0; // If n is non-positive, the sum is 0
        }

        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        return sum;
    }

}
