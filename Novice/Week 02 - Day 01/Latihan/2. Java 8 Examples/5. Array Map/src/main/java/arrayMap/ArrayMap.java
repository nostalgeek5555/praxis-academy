/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package arrayMap;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.function.Integers.add;
import static fj.Show.arrayShow;
import static fj.Show.intShow;

public final class ArrayMap {
 
    public static void main(final String[] args) {
        final Array<Integer> a = array(1,2,3);
        final Array<Integer> b = a.map(add.f(42));
        final Array<Integer> c = a.map(i -> i + 42);

        arrayShow(intShow).println(b);
        arrayShow(intShow).println(c);
    }
}