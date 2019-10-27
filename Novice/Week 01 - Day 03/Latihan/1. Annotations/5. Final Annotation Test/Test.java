import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation
{
    String Developer () default "Nostalgeek";
    String Expirydate ();
}

public class Test
{
    @TestAnnotation(Developer="data", Expirydate = "31-13-2031")
    void fun1()
    {
        System.out.println("Test method 1");
    }

    @TestAnnotation(Developer = "fair", Expirydate = "21-12-2021")
    void fun2()
    {
        System.out.println("Test method 2");
    }

    public static void main(String args[])
    {
        System.out.println("Hello");
    }
}