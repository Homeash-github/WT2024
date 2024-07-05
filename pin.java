import java.util.*;
public class pin{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b=sc.nextInt();
		System.out.print("Enter 3rd number: ");
		int c=sc.nextInt();
		System.out.print("Enter 4th number: ");
		int d=sc.nextInt();
		System.out.println("Pin value: "+PIN(a,b,c,d));
	}
	public static int PIN(int a,int b,int c,int d)
	{
		int A[]={a,b,c};
		int sum=0,pin=0;
		for(int i=0;i<3;i++)
		{
			int div=0,maxi=0,mini=10;
			while(A[i]!=0)
			{
				div=A[i]%10;
				A[i]=A[i]/10;
				if(div>maxi)
					maxi=div;
				if(div<mini)
					mini=div;
			}
			sum=sum+(maxi*mini);
		}
		pin=pin+sum-d;
		return pin;
	}
}