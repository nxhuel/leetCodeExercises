package longestPalindromicSubstring;

public class Palindromic {
    public static String longestPalindrome(String s) {
        // case 1 (errors)
        if (s == null || s.length() == 0) {
            return "";
        }
        String current = "";
        String max = "";
        //  case 2 (individual)
        for (int i = 0; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            current = String.valueOf(s.charAt(i));

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                current = s.charAt(left) + current + s.charAt(right);
                left--;
                right++;
            }
            if (current.length() > max.length()) {
                max = current;
            }
        }
        //  case 3 (double)
        for (int i = 0; i < s.length() - 1; i++) {
            int left = i;
            int right = i + 1;
            current = "";

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                current = s.charAt(left) + current + s.charAt(right);
                left--;
                right++;
            }
            if (current.length() > max.length()) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babhannah"));
    }
}