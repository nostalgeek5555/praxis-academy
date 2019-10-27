class Base 
{
    public void Display()
    {
        System.out.println("Base Display()");
    }

    public static void main(String args[])
    {
        Base t1 = new Derived();
        t1.Display();
    }
}

class Derived extends Base
{
    @Override
    public void Display()
    {
        System.out.println("Derived Display()");
    }
}