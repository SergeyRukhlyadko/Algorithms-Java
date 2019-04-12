package performance.util;

public class Printer<P> {

    public void printArray(P... array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(P i : array) sb.append(i).append(" ");
        sb.append("]");
        System.out.println(sb.toString());
    }

    public void writeArray(StringBuilder sb, P... array) {
        sb.append("[ ");
        for(P i : array) sb.append(i).append(" ");
        sb.append("]");
    }
}
