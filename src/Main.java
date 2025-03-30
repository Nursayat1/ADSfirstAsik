import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num (with space): ");
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Min: " + MinFinder.findMin(arr));
        System.out.println("Avg: " + AverageFinder.findAverage(arr));

        System.out.print("Enter number to check if it's prime: ");
        int num = scanner.nextInt();
        System.out.println("prime?: " + PrimeChecker.isPrime(num));

        System.out.print("Enter num to calc factorial: ");
        int factNum = scanner.nextInt();
        System.out.println("Factorial: " + FactorialCalculator.factorial(factNum));

        System.out.print("Enter number Fibonacci: ");
        int fibNum = scanner.nextInt();
        System.out.println("Fibonacci num: " + FibonacciCalculator.fibonacci(fibNum));

        System.out.print("Enter base and exponent: ");
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        System.out.println("Result: " + PowerCalculator.power(base, exponent));

        System.out.print("Enter a string for permutations: ");
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println("Permutations: ");
        StringPermutations.getPermutations(str, "");

        System.out.print("Enter string to check for digits: ");
        String digitStr = scanner.nextLine();
        System.out.println("digits?: " + DigitChecker.isAllDigits(digitStr));

        System.out.print("Enter n and k for binomial coefficient: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println("C(n, k): " + BinomialCoefficient.fact(n) / (BinomialCoefficient.fact(k) * BinomialCoefficient.fact(n - k)));

        System.out.print("Enter two numbers for GCD: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD: " + GCDCalculator.gcd(a, b));

        scanner.close();
    }
}
