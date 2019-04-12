package performance.sorts;

import performance.util.Swaper;

public class HeapSorting<A extends Comparable> implements Sorting<A> {

    Swaper<A> swaper = new Swaper<>();

    private int size;

    private void downHeap(A[] array, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if (l < size && array[largest].compareTo(array[l]) < 0) largest = l;
        if (r < size && array[largest].compareTo(array[r]) < 0) largest = r;
        if (i != largest) {
            swaper.swap(array, i , largest);
            downHeap(array, largest);
        }
    }

    @Override
    public A[] sort(A[] array) {
        size = array.length;
        for(int i = size / 2 - 1; i >= 0; i--) downHeap(array, i);
        while(size > 1) {
            swaper.swap(array, --size, 0);
            downHeap(array, 0);
        }
        return array;
    }

    @Override
    public String getDescription() { return "HeapSorting"; }
}
