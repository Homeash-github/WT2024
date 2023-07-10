class Base{
    public int a=5;

}
public class InheritanceSample extends Base {
    public static void main(String[]args)
    {
        int b = 6;
        InheritanceSample o1 = new InheritanceSample();
        System.out.println(o1.a*b);

    }
}
