public class Main
{
    public static int gcd(int a, int b)
    {
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
        
    }
	public static void main(String[] args) {
		int a = 12, b = 36;
		System.out.print(gcd(a,b));
	}
}
