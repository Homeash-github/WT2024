import java.util.Scanner;
public class caeser_cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String s = sc.nextLine();
        System.out.println("Enter k value: ");
        int k= sc.nextInt();
        s=s.toUpperCase();
        String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] C =a.toCharArray();
        char[] ch=s.toCharArray();
        int l=ch.length;
        int la=C.length;
        String decr="";
        for (int i = 0; i<l;i++)
        {
            for (int j =0; j<la;j++)
            {
                if (ch[i]==C[j])
                {
                    if (k + j >= la)
                    {
                        int z = k + j - la;
                        decr += C[z];
                    }
                    else {
                        int z = k + j;
                        decr += C[z];
                    }
                }
                else if(ch[i]==' ')
                {
                    decr+="  ";
                    break;
                }
                }
            }
        System.out.println("Decrypted message:  "+decr);
    }
}

