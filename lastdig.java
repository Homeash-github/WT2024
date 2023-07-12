import java.util.Scanner;

public class lastdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=sc.nextInt();
        System.out.println(lastdig(a));
    }
    static int lastdig(int n)
    {
        int x = n%10;
        if (x<0)
             return -x;
        return x;
    }
}
