package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {

        this.array = array;
    }

    public SomeType findOddOccurringValue() {
//        int count = 1;
//        boolean compared = new boolean(array);
//      //  Arrays.stream(array).sorted();
//        Arrays.fill(compared);
//
//        for (SomeType element : array) {
//            for (SomeType elementb : array)
//                if (element == elementb) {
//                    count++;
//                }
//
//        }
//        if (count % 2 != 0) {
//            SomeType oddOccurrance = array[count];
//            return oddOccurrance;
        return null;

    }








    public SomeType findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
