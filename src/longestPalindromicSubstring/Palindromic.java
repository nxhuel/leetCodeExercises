package longestPalindromicSubstring;

public class Palindromic {
    public static String longestPalindrome(String s) {
        // case 1 (avoid mistakes)
        s = s.replaceAll("[^a-zA-Z]", "");
        s = s.toLowerCase();
        if (s == null || s.length() == 0) {
            return "Error. La cadena esta vacia o es nula";
        }
        if (s.matches("\\d+")) {
            return "Error. La cadena debe contener solo letras";
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
}