import java.util.Scanner;
public class PasswordGen
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String S;
        System.out.println("Enter a Sentence: ");
        S = sc.nextLine();
        int l1 = S.length();
        String[] sl = S.split(" ");
        int l2 = sl.length;
        String z = "";
        for (int i = 0; i < l2; i++)
        {
            String st = "";
            for (int j = 0; j < sl[i].length(); j++)
            {
                st = sl[i].charAt(j) + st;
            }
            if (st.equals(sl[i]))
            {
                System.out.println(sl[i] + " is Palindrome");
            }
            else
            {
                System.out.println(sl[i] + " is not a Palindrome");
                String x=sl[i]+st;
                sl[i]=x;
                System.out.println("After making Palindrome: "+x);
            }
        }
        String pwd="",c="";
        for(int b = 0; b< sl.length;b++)
        {
            if(b>sl[b].length())
            {
                c=c+sl[b].charAt(-1);
            }
            else
            {
                c=c+sl[b].charAt(b);
            }
        }
        int ASCII=0;
        for(int q=0;q<c.length();q++)
        {
            ASCII=(int)c.charAt(q);
            pwd=pwd+c.charAt(q)+ASCII;
        }
        System.out.println("Your password is: "+pwd);
    }
}
