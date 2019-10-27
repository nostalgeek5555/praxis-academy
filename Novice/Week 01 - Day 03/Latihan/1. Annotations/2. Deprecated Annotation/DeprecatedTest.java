public class DeprecatedTest 
{
    @Deprecated
    public void Display()
    {
        System.out.print("Deprecated Test Display");
    }

    public static void main(String args[])
    {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}