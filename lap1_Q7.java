public class lap1_Q7 {
    public static void main(String[] args) {
        int n = 5;
        int squareSum = calculateSquareSum(n);
        System.out.println( n + " is: " + squareSum);
    }
    public static int calculateSquareSum(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        return sum;
    }


}
