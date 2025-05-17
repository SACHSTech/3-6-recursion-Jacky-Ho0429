package recursion;

public class SubsetsOfAString {

    public static void generateSubsets(String s) {
        for (int length = 1; length <= s.length(); length++) {
            generateSubsets(s, "", 0, length);
        }
    }

    private static void generateSubsets(String s, String current, int index, int targetLength) {
        if (current.length() == targetLength) {
            System.out.println(current);
            return;
        }
        if (index == s.length()) {
            return;
        }
        
        generateSubsets(s, current + s.charAt(index), index + 1, targetLength);

        generateSubsets(s, current, index + 1, targetLength);
    }

    public static void main(String[] args) {
        generateSubsets("abc");
    }
}
