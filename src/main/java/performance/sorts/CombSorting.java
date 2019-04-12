package performance.sorts;

import performance.util.Swaper;

public class CombSorting<A extends Comparable> implements Sorting<A> {

    Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        int gap = array.length;
        boolean swapped = true;
        while(gap > 1 || swapped) {
            if (gap > 1) gap = (int) (gap / 1.247330950103979);
            int i = 0;
            swapped = false;
            while(i + gap < array.length) {
                if (array[i].compareTo(array[i + gap]) > 0) {
                    swaper.swap(array, i, i + gap);
                    swapped = true;
                }
                i++;
            }
        }
        return array;
    }

    @Override
    public String getDescription() { return "CombSorting"; }
}
