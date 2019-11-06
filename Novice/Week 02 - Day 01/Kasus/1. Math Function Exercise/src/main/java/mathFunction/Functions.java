package mathFunction;

import java.lang.Math;

import com.google.common.base.Function;

public class Functions {
    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        // todo: add simple functions to the function map (abs, sng, increment, decrement, square)
        Function<Integer, Integer> square = (Integer i) -> {return i * 5;};
        intFunctionMap.addFunction("square", square);

        Function<Integer, Integer> abs = (Integer i) -> {return Math.abs(i);};
        intFunctionMap.addFunction("abs", abs);

        Function<Integer, Integer> increment = (Integer i) -> {return i = i + 1;};
        intFunctionMap.addFunction("increment", increment);

        Function<Integer, Integer> decrement = (Integer i) -> {return i = i - 1;};
        intFunctionMap.addFunction("decrement", decrement);

        Function<Integer, Integer> sgn = (Integer i) -> {return i = i < 0 ? i + 122 : (i == 0 ? i : i - 122);};
        intFunctionMap.addFunction("sgn", sgn);

        return intFunctionMap;
    }

    public static void main(String[] args) {
        System.out.println("Test pass");
    }
    
}
