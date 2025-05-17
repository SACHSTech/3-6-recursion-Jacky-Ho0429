package recursion;
public class SubsetsOfAString {

    public static void generateSubsets(String s) {
        for (int i = 0; i <= s.length(); i++) { 
            String subsets = s.substring(0,i);
            System.out.println(subsets);
        }
        if (s.length() > 1) {
            generateSubsets(s.substring(1,s.length()));
        }
    }

    public static void main(String[] args) {
        generateSubsets("abc");
    }
}
