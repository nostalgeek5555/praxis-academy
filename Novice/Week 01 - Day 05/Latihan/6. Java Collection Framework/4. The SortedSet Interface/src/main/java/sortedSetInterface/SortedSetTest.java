/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sortedSetInterface;

import java.util.*;

public class SortedSetTest {

    public static void main(String[] args) {
        SortedSet set = new TreeSet();

        set.add("b");
        set.add("c");
        set.add("a");

        Iterator it = set.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element.toString());
        }
    }
}