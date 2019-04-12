package performance.sorts;

import performance.util.Swaper;

public class ShakerSorting<A extends Comparable> implements Sorting<A> {

    private Swaper<A> swaper = new Swaper<>();

    @Override
    public A[] sort(A[] array) {
        int left = 0;
        int right = array.length - 1;
        int i;
        do {
            for(i = left; i < right; i++)
                if (array[i].compareTo(array[i + 1]) > 0) swaper.swap(array, i, i + 1);
            right--;
            for(i = right; i > left; i--)
                if (array[i].compareTo(array[i - 1]) < 0) swaper.swap(array, i, i - 1);
            left++;
        } while(left < right);
        return array;
    }

    @Override
    public String getDescription() { return "ShakerSorting"; }
}
