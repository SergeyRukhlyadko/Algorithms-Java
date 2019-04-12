package performance.sorts;

public class InsertionSortingWithInnerSwap<A extends Comparable> implements Sorting<A> {

    @Override
    public A[] sort(A[] array) {
        A tmp;
        int i, j;
        for(i = 0; i < array.length; i++) {
            tmp = array[i];
            for(j = i - 1; j >= 0 && array[j].compareTo(tmp) > 0; j--) array[j + 1] = array[j];
            array[j + 1] = tmp;
        }
        return array;
    }

    @Override
    public String getDescription() { return "InsertionSortingWithInnerSwap"; }

}
