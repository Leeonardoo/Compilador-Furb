package compilador.furb.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Semantico implements Constants {

    private enum Types {
        INT("int64"),
        FLOAT("float64"),
        BOOL("bool"),
        STRING("string");

        public final String name;

        Types(String name) {
            this.name = name;
        }
    }

    private String operador = "";
    private List<String> codigo = new ArrayList<>();
    private Stack<Types> pilhaTipos = new Stack<>();
    private List<String> listaId = new ArrayList<>();

    public void executeAction(int action, Token token) throws SemanticError {

        switch (action) {
            case 1 -> action1(token);

            case 5 -> action5(token);

            case 6 -> action6(token);

            case 9 -> action9(token);

            case 10 -> action10(token);

            case 11 -> action11();

            case 12 -> action12();

            case 14 -> action14();

            case 15 -> action15();

            case 16 -> action16();

            case 17 -> action17(token);

            case 21 -> action21(token);

            case 22 -> action22(token);

            case 23 -> action23();

            case 24 -> action24(token);

            //1 - 22
            //25, 26 e 27

            case 34 -> action34(token);
            //default -> throw new SemanticError("Ação semântica não implementada: " + action);
        }
    }

    public List<String> getCodigo() {
        return new ArrayList<>(codigo);
    }

    private void action1(Token token) throws SemanticError {
        Types type1 = pilhaTipos.pop();
        Types type2 = pilhaTipos.pop();

        if ((type1 != Types.INT && type1 != Types.FLOAT) || type2 != Types.INT && type2 != Types.FLOAT) {
            throw new SemanticError("tipos incompatíveis em expressão aritmética", token.getPosition());
        }

        if (type1 == Types.FLOAT || type2 == Types.FLOAT) {
            pilhaTipos.push(Types.FLOAT);
        } else {
            pilhaTipos.push(Types.INT);
        }
        codigo.add("add");
    }

    private void action5(Token token) {
        pilhaTipos.push(Types.INT);
        codigo.add("ldc.i8 " + token.getLexeme());
        codigo.add("conv.r8");
    }

    private void action6(Token token) {
        pilhaTipos.push(Types.FLOAT);
        codigo.add("ldc.r8 " + token.getLexeme());
    }

    private void action9(Token token) {
        operador = token.getLexeme();
    }

    private void action10(Token token) throws SemanticError {
        Types type1 = pilhaTipos.pop();
        Types type2 = pilhaTipos.pop();

        if (type1 != type2) {
            throw new SemanticError("tipos incompatíveis em expressão relacional", token.getPosition());
        }
        pilhaTipos.push(Types.BOOL);

        switch (operador) {
            case ">" -> codigo.add("cgt");

            case "<" -> codigo.add("clt");

            case "==" -> codigo.add("ceq");

            case "<>" -> codigo.add("""
                    ceq
                    ldc.i4.0
                    ceq
                    """
            );
        }
    }

    private void action11() {
        pilhaTipos.push(Types.BOOL);
        codigo.add("ldc.i4.1");
    }

    private void action12() {
        pilhaTipos.push(Types.BOOL);
        codigo.add("ldc.i4.0");
    }

    private void action14() {
        Types type = pilhaTipos.pop();
        if (type == Types.INT) {
            codigo.add("conv.i8");
        }

        codigo.add("call void [mscorlib]System.Console::Write(" + type.name + ")");
    }

    private void action15() {
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

    private void action16() {
        codigo.add("""
                ret
                }
                }
                """
        );
    }

    private void action17(Token token) {
        pilhaTipos.push(Types.STRING);
        codigo.add("ldstr " + token.getLexeme());
    }

    private void action21(Token token) throws SemanticError {
        Types type1 = pilhaTipos.pop();
        Types type2 = pilhaTipos.pop();

        if (type1 != Types.BOOL || type2 != Types.BOOL) {
            throw new SemanticError("tipos incompatíveis em expressão lógica", token.getPosition());
        }

        pilhaTipos.push(Types.BOOL);

        codigo.add("and");
    }

    private void action22(Token token) throws SemanticError {
        Types type1 = pilhaTipos.pop();
        Types type2 = pilhaTipos.pop();

        if (type1 != Types.BOOL || type2 != Types.BOOL) {
            throw new SemanticError("tipos incompatíveis em expressão lógica", token.getPosition());
        }

        pilhaTipos.push(Types.BOOL);

        codigo.add("or");
    }

    private void action23() {
        for (String id : listaId) {
            String type = "";
            switch (id.charAt(0)) {
                case 'I' -> type = Types.INT.name;

                case 'F' -> type = Types.FLOAT.name;

                case 'S' -> type = Types.STRING.name;

                case 'B' -> type = Types.BOOL.name;
            }

            codigo.add(".locals(" + type + " " + id + ")");
        }

        listaId.clear();
    }

    private void action24(Token token) {
        listaId.add(token.getLexeme());
    }

    private void action34(Token token) {
        codigo.add("ldloc " + token.getLexeme());

        String id = token.getLexeme();

        switch (id.charAt(0)) {
            case 'I' -> {
                pilhaTipos.push(Types.INT);
                codigo.add("conv.r8");
            }

            case 'F' -> pilhaTipos.push(Types.FLOAT);

            case 'S' -> pilhaTipos.push(Types.STRING);

            case 'B' -> pilhaTipos.push(Types.BOOL);
        }
    }
}