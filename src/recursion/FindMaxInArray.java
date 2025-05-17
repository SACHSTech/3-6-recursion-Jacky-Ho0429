package recursion;

public class FindMaxInArray {
    public static int findMax(int[] arr, int n) {
        if (n - 1 == 0) {
            return arr[0];
        }
        int currentMax = findMax(arr, n - 1);
        if (arr[n - 1] > currentMax) {
            return arr[n - 1];
        } else {
            return currentMax;
        }
    }

    public static void main(String[] args) {
        int[] array = {-10, -2, -3, -4, 4};
        System.out.println(findMax(array, 4));
    }
}