package compilador.furb.compiler;

import compilador.furb.utils.Utils;

public class AnalysisError extends Exception {
    private final int position;

    public AnalysisError(String msg, int position) {
        super(msg);
        this.position = position;
    }

    public AnalysisError(String msg) {
        super(msg);
        this.position = -1;
    }

    public int getPosition() {
        return position;
    }

    public int getLine(String input) {
        return Utils.getLineAtStringPosition(input, position);
    }

    public String toString() {
        return super.toString() + ", @ " + position;
    }
}
