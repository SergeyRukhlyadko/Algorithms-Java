package performance.sorts;

import performance.util.Swaper;

public class BubbleSorting<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        int i, j;
        for(i = 0; i < array.length - 1; i++) {
            for(j = 1; j < array.length - i; j++)
                if (array[j].compareTo(array[j - 1]) < 0) swaper.swap(array, j, j - 1);
        }
        return array;
    }

    @Override
    public String getDescription() { return "BubbleSorting"; }
}