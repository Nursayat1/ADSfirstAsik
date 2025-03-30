public class DigitChecker {
    public static String isAllDigits(String s) {
        return s.matches("\\d+") ? "Yes" : "No";
    }
}
