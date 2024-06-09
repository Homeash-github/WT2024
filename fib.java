import java.util.*;
import java.io.*;
public class fib {
    public static int fibn(int k)
    {
        int a=0,b=1;
        if (k==0||k==1)
            return k;
        return fibn(k-1)+fibn(k-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n:");
        n=sc.nextInt();
        System.out.print(fibn(n-1));

    }
}