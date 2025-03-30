public class PrimeChecker {
    public static String isPrime(int n) {
        if (n < 2) return "Composite";
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return "Composite";
        }
        return "Prime";
    }
}
