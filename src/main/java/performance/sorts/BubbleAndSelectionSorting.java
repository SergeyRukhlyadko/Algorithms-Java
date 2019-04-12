package performance.sorts;

import performance.util.Swaper;

public class BubbleAndSelectionSorting<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        int i, j, min;
        boolean f;
        for(i = 0; i < array.length - 1; i++) {
            f = false;
            min = i;
            for(j = i; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swaper.swap(array, j, j + 1);
                    f = true;
                }
                if (array[j].compareTo(array[min]) < 0) min = j;
            }
            if (!f) break;
            if (min != i) swaper.swap(array, min, i);
        }
        return array;
    }

    @Override
    public String getDescription() { return "BubbleAndSelectionSorting"; }
}
