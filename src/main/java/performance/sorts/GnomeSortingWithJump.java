package performance.sorts;

import performance.util.Swaper;

public class GnomeSortingWithJump<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        int i = 1;
        int j = 2;
        while(i < array.length) {
            if (array[i - 1].compareTo(array[i]) < 0) {
                i = j;
                j++;
            } else {
                swaper.swap(array, i, i - 1);
                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            }
        }
        return array;
    }

    @Override
    public String getDescription() { return "GnomeSortingWithJump"; }
}
