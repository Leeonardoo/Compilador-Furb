package compilador.furb.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Semantico implements Constants {

    private String operador = "";
    private List<String> codigo = new ArrayList<>();
    private Stack<String> pilhaTipos = new Stack<>();

    public void executeAction(int action, Token token) throws SemanticError {

        switch (action) {
            case 5 -> action5(token);

            case 6 -> action6(token);

            case 14 -> action14(token);

            case 15 -> action15(token);

            case 16 -> action16(token);

            //default -> throw new SemanticError("Ação semântica não implementada: " + action);
        }
    }

    public List<String> getCodigo() {
        return new ArrayList<>(codigo);
    }

    private void action5(Token token) {

    }

    private void action6(Token token) {

    }

    private void action14(Token token) {

    }

    private void action15(Token token) {
        codigo.add("""
                .assembly extern mscorlib {}
                .assembly _codigo_objeto{}
                .module   _codigo_objeto.exe
                .class public _UNICA{
                .method static public void _principal() {
                    .entrypoint
                """
        );
    }

    private void action16(Token token) {
        codigo.add("""
                    ret
                    }
                }
                """
        );
    }
}