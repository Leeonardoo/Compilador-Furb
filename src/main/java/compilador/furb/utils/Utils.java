package compilador.furb.utils;

public class Utils {

    public static int getLineAtStringPosition(String str, int pos) {
        int currentLine = 1;
        for (int i = 0; i <= pos; i++) {
            if (str.charAt(i) == '\n') {
                currentLine++;
            }
        }
        return currentLine;
    }

    public static int findWordEndIndex(String str) {
        int wordEnd = -1;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                wordEnd = i;
                break;
            }
        }

        return wordEnd;
    }
}
