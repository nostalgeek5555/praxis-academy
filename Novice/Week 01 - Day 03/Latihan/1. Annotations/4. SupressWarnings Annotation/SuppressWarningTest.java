class DeprecatedTest 
{
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecated Display");
    }
}

public class SuppressWarningTest
{
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String args[])
    {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}