public class rectangle2 {
    public static void main(String [] args)
    {
        float a = 3.5f, b = 5.0f;
        rectangle2 o1 = new rectangle2();
        o1.area(a,b);
    }
    public void area(float c, float d)
    {
        float A=c*d;
        System.out.println("Area: "+A);
    }
}
