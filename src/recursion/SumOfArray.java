package recursion;

public class SumOfArray {
    public static int sumArray(int[] arr, int n) {
        if (n - 1 < 0 || n >= arr.length) {
            return -1;
        }
        if (n - 1 == 0) {
            return arr[0];
        }
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3 , 4, 4};
        System.out.println(sumArray(array, 4));
    }
}
