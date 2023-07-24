import java.util.Scanner;

public class no_of_prime_in_range
{
        public static void main (String [] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter range: ");
            int input1=sc.nextInt();
            int input2=sc.nextInt();
            int c=0;
            for(int i=input1;i<=input2;i++)
            {
                int flag = 1;
                for(int j=2;j<=i/2;j++)
                {
                    if (i%j == 0)
                    {
                        flag=0;
                        break;
                    }
                }
                if (flag == 1)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
}

