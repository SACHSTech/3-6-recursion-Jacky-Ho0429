package recursion;

public class CheckIfStringIsPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 1) { 
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // Output: true
        System.out.println(isPalindrome("apple")); // Output: false
    }
}