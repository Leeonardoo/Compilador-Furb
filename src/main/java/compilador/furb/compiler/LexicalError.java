package compilador.furb.compiler;

public class LexicalError extends AnalysisError {
    private String culprit;

    public LexicalError(String msg, int position, String culprit) {
        super(msg, position);
        this.culprit = culprit;
    }

    public LexicalError(String msg) {
        super(msg);
    }

    public String getCulprit() {
        return culprit;
    }
}
