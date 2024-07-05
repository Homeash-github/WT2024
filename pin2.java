import java.util.Scanner;

public class pin2 {

    public static int findPin(int input1, int input2, int input3, int input4) {
        int[] inputs = {input1, input2, input3};
        int sum = 0;

        for (int number : inputs) {
            while (number > 0) {
                int digit = number % 10;
                if ((input4 % 2 == 0 && digit % 2 == 0) || (input4 % 2 != 0 && digit % 2 != 0)) {
                    sum += digit;
                }
                number /= 10;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input1: ");
        int input1 = scanner.nextInt();

        System.out.println("Enter input2: ");
        int input2 = scanner.nextInt();

        System.out.println("Enter input3: ");
        int input3 = scanner.nextInt();

        System.out.println("Enter input4: ");
        int input4 = scanner.nextInt();

        int pin = findPin(input1, input2, input3, input4);
        System.out.println("The PIN is: " + pin);
    }
}