package recursion;

public class PowerFunction {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } 
        if (exponent > 0) {
            return base * power(base, exponent - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(power(2,3)); // Output: 8
        System.out.println(power(2,-3)); // Output: 0 as 0.125 rounds down
    }
}
