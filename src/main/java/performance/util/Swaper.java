package performance.util;

public class Swaper<V> {

    public void swap(V[] array, int pos1, int pos2) {
        V v = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = v;
    }
}