import java.util.Scanner;



    public class lap1_Q1 {
        public static void main(String[] args) {
            inputAllBaseTypes();
        }
        public static void inputAllBaseTypes() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a boolean value: ");
            boolean boolValue = scanner.nextBoolean();
            System.out.println("You entered: " + boolValue);

            System.out.print("Enter a byte value: ");
            byte byteValue = scanner.nextByte();
            System.out.println("You entered: " + byteValue);

            System.out.print("Enter a short value: ");
            short shortValue = scanner.nextShort();
            System.out.println("You entered: " + shortValue);

            System.out.print("Enter an int value: ");
            int intValue = scanner.nextInt();
            System.out.println("You entered: " + intValue);

            System.out.print("Enter a long value: ");
            long longValue = scanner.nextLong();
            System.out.println("You entered: " + longValue);

//            System.out.print("Enter a float value: ");
//            float floatValue = scanner.nextFloat();
//            System.out.println("You entered: " + floatValue);

            System.out.print("Enter a double value: ");
            double doubleValue = scanner.nextDouble();
            System.out.println("You entered: " + doubleValue);

            System.out.print("Enter a character value: ");
            char charValue = scanner.next().charAt(0);
            System.out.println("You entered: " + charValue);

        }

    }

