import java.util.Scanner;

public class strdemo {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        s= sc.nextLine();
        String[] st = s.split(" ");
        System.out.println(st[0]+st[1]+st[2]);
        int l = st.length;
        int c=0;
        for(String x : st)
        {
            System.out.println("Length of "+x+ " is "+x.length());
            c+=x.length();
        }
        System.out.println("Total words: "+l);
        System.out.println("total letters: "+c);
    }
}
