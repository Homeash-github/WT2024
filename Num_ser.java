import java.util.*;
import java.io.*;

public class Num_ser{
    public static void main(String[] argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        int a,b,n;
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
             int s=0;
             
        for (int j=0;j<n;j++)
         {
             double z = (Math.pow(2,j)*b);
             int y=(int)z;
             s=s+(a+y);
             System.out.print(s+" ");
             a=0; 
         }
         System.out.println();
        }
    }
}