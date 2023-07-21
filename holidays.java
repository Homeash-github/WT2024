import java.util.Scanner;
public class holidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of holidays: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i =0;i<n;i++)
        {
            System.out.println("Enter holiday day: ");
            A[i]=sc.nextInt();
        }
        System.out.println("Total no. of holidays: "+noh(A));
    }
    static int  noh(int a[])
    {
        int hol=8;
        int l = a.length;
        for(int x :  a)
        {
            if(((x-6) % 7 !=0) && (x%7 != 0))
                hol++;
        }
        return hol;
    }
}

