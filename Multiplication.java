import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        n=sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
