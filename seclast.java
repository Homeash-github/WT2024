import java.util.Scanner;

public class seclast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=sc.nextInt();
        System.out.println(secl(a));
    }
    static int secl(int n)
    {
        int r=n%10;
        n=n/10;
        int b = n%10;
        return  b;
    }
}
