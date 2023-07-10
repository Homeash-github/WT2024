public class rectangle4
{
    public static void main(String[]args)
    {
        float a = 3.5f, b = 5.0f;
        rectangle4 o1 = new rectangle4();
        float r = o1.area(a,b);
        System.out.println(r);
    }
    public float area(float c,float d){
        float A= c*d;
        return A;
    }
}
