import java.util.Scanner;
public class basic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value value A:  ");
        double a = sc.nextDouble();
        System.out.println("Enter value value B:  ");
        double b = sc.nextDouble();
        System.out.println("1.Addition \n2.Subtraction\n3.Multiplication\n4.Division ");
        System.out.println("Enter your choice: ");
        int o = sc.nextInt();
        switch (o)
        {
            case 1:
                System.out.println("A+B: "+(a+b));
                break;
            case 2:
                System.out.println("A-B: "+(a-b));
                break;
            case 3:
                System.out.println("A x B: "+(a*b));
                break;
            case 4:
                System.out.println("A/B: "+(a/b));
                break;
            default:
                System.out.println("Wrong input !!");
                break;
        }
    }
}
