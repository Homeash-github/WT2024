import java. util.*;
public class key01
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i1,i2,i3;
		i1=sc.nextInt();
		i2=sc.nextInt();
		i3=sc.nextInt();
		System.out.println("Key value = "+key(i1,i2,i3));

	}

	public static int key(int i1,int i2,int i3)
	{
		int a[]={i1,i2,i3};

		
		int Bsum=0,Ssum=0;
		for(int i=0;i<a.length;i++)
		{
		int d,small=10,big=0;
		while(a[i]!=0)
		{
			d=a[i]%10;
			a[i]=a[i]/10;
			if(d<small)
			{
				small=d;
			}
			if(d>big)
			{
				big=d;
			}
		}	
		Bsum=Bsum+big;

		Ssum=Ssum+small;	

		}
		System.out.println(Bsum);
		System.out.println(Ssum);
		int key_val=Bsum-Ssum;
		return key_val;
	}
}