import java.util.Scanner;

public class funodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=sc.nextInt();
        System.out.println(even(a));
        System.out.println(odd(a));
    }
    static int even(int n)
    {
        if (n%2==0)
            return 2;
        else
            return  1;
    }
    static int odd(int n)
    {
        if (n%2 !=0)
            return 2;
        else
            return  1;
    }

}
