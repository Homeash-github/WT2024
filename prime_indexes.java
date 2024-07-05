import java. util.*;
public class prime_indexes
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[]={10,20,30,40,50,60,70,80,90,100};
		System.out.println("Sum of Prime Indexes are: "+sum_prime(A));
	}
	public static int sum_prime(int A[])
	{
		int sum=0;
		for(int i=1;i<A.length;i++)
		{
			int c=0;
			for(int j=1;j<i+1;j++)
			{
				if(i%j==0)
					c++;
			}
			// System.out.println("Values at Prime Indices are:");
			if (c==2){
				System.out.println(A[i]);
				sum=sum+A[i];
			}
		}
		return sum;
	}
}