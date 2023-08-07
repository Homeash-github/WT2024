import java.util.Scanner;
import java.math.*;
public class Sci_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value value A:  ");
//        double a = sc.nextDouble();
//        System.out.println("Enter value value B:  ");
//        double b = sc.nextDouble();
        System.out.println("1.Sine  \n2.Cosine\n3.Tangent\n4. Ceil\n5. Floor\n6. Power ");
        System.out.println("Enter your choice: ");
        int o = sc.nextInt();
        switch (o) {
            case 1:
                System.out.println("Enter value value A:  ");
                double a = sc.nextDouble();
                System.out.println("Sin(" + a + "):" + Math.sin(a));
                break;
            case 2:
                System.out.println("Enter value value A:  ");
                double b = sc.nextDouble();
                System.out.println("Cos(" + b + "):" + Math.cos(b));
                break;
            case 3:
                System.out.println("Enter value value A:  ");
                double c = sc.nextDouble();
                System.out.println("Tan(" + c + "):" + Math.tan(c));
                break;
            case 4:
                System.out.println("Enter value value A:  ");
                double d = sc.nextDouble();
                System.out.println("Ceil a:" + Math.ceil(d));
                break;
            case 5:
                System.out.println("Enter value value A:  ");
                double e = sc.nextDouble();
                System.out.println("Floor a: " + Math.floor(e));
                break;
            case 6:
                System.out.println("Enter value value A:  ");
                int f = sc.nextInt();
                System.out.println("Enter value value B:  ");
                int f2 = sc.nextInt();
                System.out.println(f + "^" + f2 + ": " + Math.pow(f, f2));
                break;
            default:
                System.out.println("Wrong input !!");
                break;
        }
    }
}
