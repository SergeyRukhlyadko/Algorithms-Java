package performance.sorts;

public class ShellSortingSedjvik<A extends Comparable> implements Sorting<A> {

    private int increment(int[] inc, int size) {
        int p1, p2, p3, s;
        p1 = p2 = p3 = 1;
        s = -1;
        do {
            if (++s % 2 == 0) {
                inc[s] = 9 * p1 - 9 * p3 + 1;
                p2 *= 2;
                p3 *= 2;
            } else {
                inc[s] = 8 * p1 - 6 * p2 + 1;
            }
            p1 *= 2;
        } while(3 * inc[s] < size);
        return s > 0 ? --s : 0;
    }

    @Override
    public A[] sort(A[] array) {
        int inc, i, j, s;
        int[] seq = new int[40];
        s = increment(seq, array.length);
        while (s >= 0) {
            inc = seq[s--];
            for(i = inc; i < array.length; i++) {
                A temp = array[i];
                for(j = i - inc; j >= 0 && array[j].compareTo(temp) > 0; j -= inc)
                    array[j + inc] = array[j];
                array[j + inc] = temp;
            }
        }
        return array;
    }

    @Override
    public String getDescription() { return "ShellSortingSedjvik"; }
}
