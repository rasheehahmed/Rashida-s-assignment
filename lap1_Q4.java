public class lap1_Q4 {

    public static void main(String[] args) {
        int number = 6;
        boolean isNumberEven = isEven(number);
        System.out.println( number +" "+ isNumberEven);
    }
    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }
}
