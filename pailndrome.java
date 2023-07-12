import java.util.Scanner;

public class pailndrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        System.out.println("Enter a string: ");
        S=sc.nextLine();
        String st = "";
        for(int i=S.length()-1;i>=0;i--)
        {
            st =  st+S.charAt(i) ;
        }
        System.out.println(st);
        System.out.println(S);
//        System.out.println(st);
        String res = st.equals(S)?"Its a Palindrome":"Its not a Palindrome";
        System.out.println(res);
        String s2="";
        if (res == "False")
        {
            s2=S+st;
            System.out.print("New String after making it Palindrome: "+s2);
        }
    }
}
