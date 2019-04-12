package performance.sorts;

import performance.util.Swaper;

public class QuickSorting<A extends Comparable> implements Sorting<A> {

    Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(A[] array, int begin, int end) {
        int i = begin;
        int j = end;
        A p = array[++end - begin >> 1];
        do {
            while(array[i].compareTo(p) < 0) i++;
            while(array[j].compareTo(p) > 0) j--;
            if (i <= j) {
                swaper.swap(array, i , j);
                i++;
                j--;
            }
        } while(i <= j);
        if (j > begin) quickSort(array, begin, j);
        if (end > i) quickSort(array, i, end);
    }

    @Override
    public String getDescription() { return "QuickSorting"; }
}
