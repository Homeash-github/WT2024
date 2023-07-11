import java.util.Scanner;
public class dem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        String res=num>num2?"Number 1 is greatest":"Number 2 is greatest";

        System.out.println(""+res);
    }
}
