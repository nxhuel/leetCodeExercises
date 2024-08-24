package zigzagConversion;

public class Zigzag {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        int position = 6;
        String column = "";
        int space = 2;
        String blankSpace = " ".repeat(numRows - space);

        for (int rowPosition = position; rowPosition < s.length(); rowPosition++) {
            int reverse = rowPosition + (numRows + space);
            while (space > 0) {
                if (space <= numRows) {
                    column += s.charAt(rowPosition) + blankSpace + s.charAt(reverse) + "\n";
                }
                if (space == numRows) {
                    column += s.charAt(rowPosition + 1) + blankSpace + "\n";
                }
                space++;
                blankSpace = " ".repeat(Math.max(0, numRows - space));
                reverse--;
                rowPosition++;

            }
        }

        System.out.println(column);

        return "";
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }
}