package performance.sorts;

import performance.util.Swaper;

public class ShellSortingD2<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        int increment = array.length / 2;
        while(increment >= 1) {
            for(int startIndex = 0; startIndex < increment; startIndex++)
                insertionSort(array, startIndex, increment);
            increment /= 2;
        }
        return array;
    }

    private void insertionSort(A[] array, int startIndex, int increment) {
        int i, j;
        for(i = startIndex; i < array.length - 1; i += increment) {
            for(j = Math.min(i + increment, array.length - 1); j - increment >= 0; j = j - increment) {
                if (array[j - increment].compareTo(array[j]) > 0) {
                    swaper.swap(array, j - increment, j);
                } else {
                    break;
                }
            }
        }
    }

    @Override
    public String getDescription() { return "ShellSortingD2"; }
}
