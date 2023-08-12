import java.util.Scanner;

public class Candle {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of candles:  ");
        int n = sc.nextInt();
        int bal=0;
        System.out.println("Enter m:  ");
        int m = sc.nextInt();
        int t1=n;
        while((n>0) && (m>=1))
        {
            n=n/m;
            t1+=n;
        }

        int total=t1;
        System.out.println("Total number of hours: "+total);
    }
}
