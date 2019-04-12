package performance.sorts;

public interface Sorting<A extends Comparable> {

    A[] sort(A[] array);

    String getDescription();
}