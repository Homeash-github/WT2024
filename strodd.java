import java.util.Scanner;

public class strodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        for (int i = 0; i<s.length();i++)
        {
            if(i%2 != 0)
            {
                System.out.print(s.charAt(i));

            }
            continue;
        }
    }
}
