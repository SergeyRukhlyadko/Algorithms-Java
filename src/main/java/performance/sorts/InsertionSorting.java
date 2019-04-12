package performance.sorts;

import performance.util.Swaper;

public class InsertionSorting<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        int i, j;
        for(i = 1; i < array.length; i++) {
            for(j = i; j > 0 && array[j].compareTo(array[j - 1]) < 0; j--) swaper.swap(array, j, j - 1);
        }
        return array;
    }

    @Override
    public String getDescription() { return "InsertionSorting"; }
}