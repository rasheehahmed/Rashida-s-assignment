public class lap1_Q5 {

    public static void main(String[] args) {
        int n = 5;
        int sum = calculateSum(n);
        System.out.println( n + " is: " + sum);
    }
    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
