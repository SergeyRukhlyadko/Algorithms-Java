package performance.tests;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import performance.sorts.BubbleSorting;
import performance.sorts.QuickSorting;
import performance.util.Printer;
import performance.util.RandomGenerator;

@State(Scope.Benchmark)
public class SortingTest{

    private Integer[] array;
    private Integer[] tmp;

    @Setup(Level.Trial)
    public void setupTrial() { array = new RandomGenerator().generateIntArray(10, 1000); }

    @Setup(Level.Iteration)
    public void setupIteration() { tmp = Arrays.copyOf(array, array.length); }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    //@Warmup(iterations = 5)
    @Fork(value = 1)
    //@Measurement(iterations = 5)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void run() {
        new Printer<Integer>().printArray(tmp);
        new QuickSorting<Integer>().sort(tmp);
        new Printer<Integer>().printArray(tmp);
    }
}
