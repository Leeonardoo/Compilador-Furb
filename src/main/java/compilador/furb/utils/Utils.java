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

    public static int findFirstWordEndIndex(String str) {
        int wordEnd;

        int nextNewLine = str.indexOf("\n");
        int nextSpace = str.indexOf(" ");

        if (nextNewLine < 0 && nextSpace < 0) {
            wordEnd = -1;
        } else if (nextNewLine > 0 && (nextNewLine < nextSpace || nextSpace == -1)){
            wordEnd = nextNewLine;
        } else if (nextSpace > 0 && (nextSpace < nextNewLine || nextNewLine == -1)) {
            wordEnd = nextSpace;
        } else {
            wordEnd = nextSpace;
        }

        return wordEnd;
    }
}
