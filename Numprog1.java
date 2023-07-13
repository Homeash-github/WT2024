import java.util.Scanner;

public class Numprog1 {
    static int co = 0, ce = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if (num<0)
            num*=-1;
        System.out.println("odd: " + odd(num) + " even: " + even(num) + " prime: " + pri(num));
    }
    static int even(int n) {
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            if (rem % 2 == 0)
                ce++;
        }
        return ce;
    }
    static int odd(int n) {
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            if (rem % 2 != 0)
                co++;
        }
        return co;
    }
    static int pri(int n) {
        int cp = 0;
        while (n > 0) {

            int rem = n % 10;
            n = n / 10;
            int x = 0;

            for (int i = 2; i <= rem; i++) {

                for (int j = 1; j <= i; j++) {
                    if (rem % i == 0)
                        x++;
                }
                    if (x == 2)
                        cp++;
                }

            }
        return cp;
        }

    }


