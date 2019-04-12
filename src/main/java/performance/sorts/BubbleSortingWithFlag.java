package performance.sorts;

import performance.util.Swaper;

public class BubbleSortingWithFlag<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        boolean f;
        int i, j;
        for(i = 0; i < array.length - 1; i++) {
            f = false;
            for(j = 1; j < array.length - i; j++) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                    swaper.swap(array, j, j - 1);
                    f = true;
                }
            }
            if (!f) break;
        }
        return array;
    }

    @Override
    public String getDescription() { return "BubbleSortingWithFlag"; }
}
