package performance.sorts;

import java.util.Arrays;

public class ParallelStreamSorting<A extends Comparable> implements Sorting<A> {

    @Override
    public A[] sort(A[] array) {
        Arrays.parallelSort(array);
        return array;
    }

    @Override
    public String getDescription() { return "ParallelStreamSorting"; }
}
