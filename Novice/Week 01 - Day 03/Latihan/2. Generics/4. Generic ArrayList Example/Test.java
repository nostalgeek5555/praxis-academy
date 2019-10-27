import java.util.*;

class Test
{
    public static void main(String[] args)
    {
        ArrayList <String> al = new ArrayList<String> ();

        al.add("Nostalgeek");
        al.add("Nostalcodia");

        String s1 = al.get(0);
        String s2 = al.get(1);

        System.out.println(s1);
        System.out.println(s2);
    }
}