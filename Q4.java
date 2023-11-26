import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int element [] = new int[6];
        Scanner ele = new Scanner(System.in);
        for (int i = 0; i < element.length; i++) {
            System.out.println("Enter your number: ");
            element[i] = ele.nextInt();
        }
        System.out.println("_________________________________");
        System.out.println("Display#");
        for (int i = 0; i < element.length; i++) {
            System.out.println(element[i]);
        }
    }
}
