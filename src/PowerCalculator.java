public class PowerCalculator {
    public static int power(int a, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            int halfPower = power(a, n / 2);
            return halfPower * halfPower;
        } else {
            return a * power(a, n - 1);
        }
    }
}
