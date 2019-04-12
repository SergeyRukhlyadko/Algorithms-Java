package performance.sorts;

import performance.util.Swaper;

public class SelectionSorting<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        int i, j;
        for(i = 0; i < array.length - 1; i++) {
            int least = i;
            for(j = i + 1; j < array.length; j++)
                if(array[j].compareTo(array[least]) < 0) least = j;
            swaper.swap(array, i, least);
        }
        return array;
    }

    @Override
    public String getDescription() { return "SelectionSorting"; }
}
