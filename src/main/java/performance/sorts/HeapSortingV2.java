package performance.sorts;

import performance.util.Swaper;

public class HeapSortingV2<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    private void downHeap(A[] array, int k, int n) {
        A newElem = array[k];
        int child;
        while(k <= n / 2) {
            child = 2 * k;
            if (child < n && array[child].compareTo(array[child + 1]) < 0) child++;
            if (newElem.compareTo(array[child]) > 0 || newElem.compareTo(array[child]) == 0) break;
            array[k] = array[child];
            k = child;
        }
        array[k] = newElem;
    }

    @Override
    public A[] sort(A[] array) {
        int i;
        for(i = array.length / 2 - 1; i >= 0; i--) downHeap(array, i, array.length - 1);
        for(i = array.length - 1; i > 0; i--) {
            swaper.swap(array, i, 0);
            downHeap(array, 0, i - 1);
        }
        return array;
    }

    @Override
    public String getDescription() { return "HeapSortingV2"; }
}
