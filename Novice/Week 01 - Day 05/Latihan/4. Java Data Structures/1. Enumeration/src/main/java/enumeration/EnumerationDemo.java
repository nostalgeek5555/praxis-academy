/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package enumeration;

import java.util.Vector;
import java.util.Enumeration;

@SuppressWarnings ("unchecked")
public class EnumerationDemo {
    public static void main(String[] args) {
        Enumeration days;
        Vector dayNames = new Vector();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();

        while(days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}