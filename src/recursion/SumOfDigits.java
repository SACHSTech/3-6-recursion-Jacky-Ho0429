package recursion;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n >= 10) {
            return (n % 10) + sumOfDigits(n / 10);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234)); // Output: 10
    }
}
