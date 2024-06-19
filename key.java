import java. util.*;
public class key
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1,input2,input3;
		input1=sc.nextInt();
		input2=sc.nextInt();
		input3=sc.nextInt();
		System.out.println("key value ="+key(input1,input2,input3));
	}
	public static int key(int input1,int input2,int input3)
	{
		int key;
		int A=input1/1000;
		int B=(input2/100)%10;
		int C,d,small=10;
		while(input3!=0)
		{
			d=input3%10;
			input3=input3/10;
			if (d<small)
				small=d;
		}
		C=small;
		key=(A*B)+C;
		return key;

	}
}