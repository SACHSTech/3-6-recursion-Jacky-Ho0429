package recursion;

public class OccurencesOfACharacter {
    public static int countChar(String s, char c) {
        int count;
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(s.length() - 1) == c) {
            count = 1;
        } else {
            count = 0;
        }
        return count + (countChar(s.substring(0, s.length() - 1),c));
    }

    public static void main(String[] args) {
        System.out.println(countChar("hello", 'l')); // Output: 2
        System.out.println(countChar("Originality", 'i')); // Output: 3
    }
}
