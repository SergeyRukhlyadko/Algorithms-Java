package performance.sorts;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSorting<A extends Comparable> implements Sorting<A> {

    @Override
    public A[] sort(A[] array) {
        Arrays.sort(array, Comparator.naturalOrder());
        return array;
    }

    @Override
    public String getDescription() { return "StreamSorting"; }
}
