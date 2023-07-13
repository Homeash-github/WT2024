import java.util.Scanner;

public class numprog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number =Math.abs(in.nextInt());
        int countOdd = 0;
        int countEven = 0;
        int countPrime = 0;

        while (number > 0) {
            int temp = number % 10;
            number /= 10;

            if (temp % 2 == 0)
                countEven++;
            else
                countOdd++;

            switch (temp) {
                case 2, 3, 5, 7 -> countPrime++;
            }
        }
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
        System.out.println("Prime: " + countPrime);

        in.close();
    }
}
