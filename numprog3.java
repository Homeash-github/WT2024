import java.util.Scanner;

public class numprog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toString(num);
        char c[]=s.toCharArray();
        for (int i = 0;i<s.length()-1;i++)
        {
            char tmp = c[i];
            c[i]=c[i+1];
            c[i+1]=tmp;
        }
        s=c.toString();
        System.out.println(c);
    }
}
