import java.util.*;

public class FibonacciCalculator {
    private static Map<Integer, Integer> fibMemo = new HashMap<>();
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (fibMemo.containsKey(n)) return fibMemo.get(n);
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        fibMemo.put(n, result);
        return result;
    }
}
