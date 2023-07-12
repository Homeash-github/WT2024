import java.util.Scanner;

public class sum_of_lastdig_of2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=sc.nextInt();
        System.out.println("Enter another Number: ");
        int b=sc.nextInt();
        System.out.println(lastdig_2(a,b));
    }
    static int lastdig_2(int x, int y)
    {
        int l = x%10;
        if (l<0)
            l=-l;
        int m = y%10;
        if (m<0)
            m=-m;
        return l+m;
    }
}
