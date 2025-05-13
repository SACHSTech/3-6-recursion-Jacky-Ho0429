package recursion;

public class EvenNumbersInARange {
    public static void printEvens(int start, int end) {
        if (start == end) {
            if (start % 2 == 0) {
                System.out.println(start);
            }
        }
        if (start < end) {
            if (start % 2 == 0) { 
                System.out.println(start);
            }
            printEvens(start + 1, end);
        }
        if (start > end) {
            if (start % 2 == 0) { 
                System.out.println(start);
            }
            printEvens(start - 1, end);
        }
    }
    public static void main(String[] args) {
        printEvens(2,0); // Output: 0 2
    }
}
