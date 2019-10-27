package annotationexample;


class Base
{
     public void display()
     {
         System.out.println("Base display()");
     }
}

class Derived extends Base
{
    @Override
     public void display()
     {
         System.out.println("Derived display(int )");
     }
}

public class Test {
    
    public static void main(String args[])
    {
        Derived obj = new Derived();
        obj.display();
    }
}