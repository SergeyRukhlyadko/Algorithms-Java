package performance.sorts;

import performance.util.Swaper;

public class GnomeSorting<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        int i = 1;
        while(i < array.length) {
            if (i == 0 || array[i - 1].compareTo(array[i]) < 0 || array[i - 1].compareTo(array[i]) == 0) {
                i++;
            } else {
                swaper.swap(array, i, i - 1);
                i--;
            }
        }
        return array;
    }

    @Override
    public String getDescription() { return "GnomeSorting"; }
}
