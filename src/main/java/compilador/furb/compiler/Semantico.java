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

    private Stack<Integer> pilhaRotulos = new Stack<>();
    private int rotulo = 1;

    public void executeAction(int action, Token token) throws SemanticError {

        switch (action) {
            case 1 -> action1(token);

            case 2 -> action2(token);

            case 3 -> action3(token);

            case 4 -> action4(token);

            case 5 -> action5(token);

            case 6 -> action6(token);

            case 7 -> action7(token);

            case 8 -> action8(token);

            case 9 -> action9(token);

            case 10 -> action10(token);

            case 11 -> action11();

            case 12 -> action12();

            case 13 -> action13(token);

            case 14 -> action14();

            case 15 -> action15();

            case 16 -> action16();

            case 17 -> action17(token);

            case 18 -> action18();

            case 19 -> action19();

            case 20 -> action20();

            case 21 -> action21(token);

            case 22 -> action22(token);

            case 23 -> action23();

            case 24 -> action24(token);

            case 25 -> action25();

            case 27 -> action27();

            case 28 -> action28();

            case 29 -> action29();

            case 30 -> action30();

            case 31 -> action31();

            case 32 -> action32(token);

            case 33 -> action33();

            case 34 -> action34(token);

            default -> throw new IllegalArgumentException("Ação semântica não implementada: " + action);
        }
    }

    public List<String> getCodigo() {
        return new ArrayList<>(codigo);
    }

    private void action1(Token token) throws SemanticError {
        Types type1 = pilhaTipos.pop();
        Types type2 = pilhaTipos.pop();

        if ((type1 != Types.INT && type1 != Types.FLOAT) || (type2 != Types.INT && type2 != Types.FLOAT)) {
            throw new SemanticError("tipos incompatíveis em expressão aritmética", token.getPosition());
        }

        if (type1 == Types.FLOAT || type2 == Types.FLOAT) {
            pilhaTipos.push(Types.FLOAT);
        } else {
            pilhaTipos.push(Types.INT);
        }
        codigo.add("add");
    }

    private void action2(Token token) throws SemanticError {
        Types type1 = pilhaTipos.pop();
        Types type2 = pilhaTipos.pop();

        if ((type1 != Types.INT && type1 != Types.FLOAT) || (type2 != Types.INT && type2 != Types.FLOAT)) {
            throw new SemanticError("tipos incompatíveis em expressão aritmética", token.getPosition());
        }

        if (type1 == Types.FLOAT || type2 == Types.FLOAT) {
            pilhaTipos.push(Types.FLOAT);
        } else {
            pilhaTipos.push(Types.INT);
        }
        codigo.add("sub");
    }

    private void action3(Token token) throws SemanticError {
        Types type1 = pilhaTipos.pop();
        Types type2 = pilhaTipos.pop();

        if ((type1 != Types.INT && type1 != Types.FLOAT) || (type2 != Types.INT && type2 != Types.FLOAT)) {
            throw new SemanticError("tipos incompatíveis em expressão aritmética", token.getPosition());
        }

        if (type1 == Types.FLOAT || type2 == Types.FLOAT) {
            pilhaTipos.push(Types.FLOAT);
        } else {
            pilhaTipos.push(Types.INT);
        }
        codigo.add("mul");
    }

    private void action4(Token token) throws SemanticError {
        Types type1 = pilhaTipos.pop();
        Types type2 = pilhaTipos.pop();

        if ((type1 != Types.INT && type1 != Types.FLOAT) || type1 != type2) {
            throw new SemanticError("tipos incompatíveis em expressão aritmética", token.getPosition());
        }

        pilhaTipos.push(type1);

        codigo.add("div");
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

    private void action7(Token token) throws SemanticError {
        Types type = pilhaTipos.pop();
        if (type != Types.FLOAT && type != Types.INT) {
            throw new SemanticError("tipos incompatíveis em expressão aritmética", token.getPosition());
        }

        pilhaTipos.push(type);
    }

    private void action8(Token token) throws SemanticError {
        Types type = pilhaTipos.pop();
        if (type != Types.FLOAT && type != Types.INT) {
            throw new SemanticError("tipos incompatíveis em expressão aritmética", token.getPosition());
        }

        pilhaTipos.push(type);
        codigo.add("ldc.i8 -1");
        codigo.add("conv.r8");
        codigo.add("mul");
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
                    ceq"""
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

    private void action13(Token token) throws SemanticError {
        Types type = pilhaTipos.pop();
        if (type != Types.BOOL) {
            throw new SemanticError("tipo incompatível em expressão lógica", token.getPosition());
        }

        pilhaTipos.push(Types.BOOL);

        codigo.add("ldc.i4.1");
        codigo.add("xor");
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
                .entrypoint"""
        );
    }

    private void action16() {
        codigo.add("""
                ret
                }
                }"""
        );
    }

    private void action17(Token token) {
        pilhaTipos.push(Types.STRING);
        codigo.add("ldstr " + token.getLexeme());
    }

    private void action18() {
        pilhaTipos.push(Types.STRING);
        codigo.add("ldstr \"\\n\"");
    }

    private void action19() {
        pilhaTipos.push(Types.STRING);
        codigo.add("ldstr \" \"");
    }

    private void action20() {
        pilhaTipos.push(Types.STRING);
        codigo.add("ldstr \"\\t\"");
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

    //TODO verificar

    /**
     * igual
     * ação #34:
     * id:= listaid.retira
     * tipoexp:= pilha.desempilha
     * <p>
     * se (tipoid=int64)
     * então código.adiciona (conv.i8)
     * fimse
     * código.adiciona (stloc id)
     */
    private void action25() throws SemanticError {
        String id = listaId.remove(listaId.size() - 1);

        Types typeId;

        switch (id.charAt(0)) {
            case 'I' -> typeId = Types.INT;

            case 'F' -> typeId = Types.FLOAT;

            case 'S' -> typeId = Types.STRING;

            case 'B' -> typeId = Types.BOOL;

            default -> throw new SemanticError("tipo de identificador inválido");
        }

        if (typeId == Types.INT) {
            codigo.add("conv.i8");
        }

        codigo.add("stloc " + id);

    }

    //TODO verificar
    private void action27() throws SemanticError {
        for (String id : listaId) {
            Types type;

            switch (id.charAt(0)) {
                case 'I' -> type = Types.INT;

                case 'F' -> type = Types.FLOAT;

                case 'S' -> type = Types.STRING;

                case 'B' -> type = Types.BOOL;

                default -> throw new SemanticError("tipo de identificador inválido");
            }

            codigo.add("call string [mscorlib]System.Console::ReadLine()");

            if (type != Types.STRING) {
                String clazz = "";

                switch (type) {
                    case INT -> clazz = "Int64";
                    case FLOAT -> clazz = "Double";
                    case BOOL -> clazz = "Boolean";
                }
                codigo.add("call " + type.name + " [mscorlib]System." + clazz + "::Parse(string)");
            }

            codigo.add("stloc " + id);
        }

        listaId.clear();
    }

    private void action28() {
        codigo.add("brfalse r" + rotulo);
        pilhaRotulos.push(rotulo);
        rotulo++;
    }

    private void action29() {
        codigo.add("r" + pilhaRotulos.pop() + ":");
    }

    private void action30() {
        codigo.add("br r" + rotulo);
        codigo.add("r" + pilhaRotulos.pop() + ":");
        pilhaRotulos.push(rotulo);
        rotulo++;
    }

    private void action31() {
        codigo.add("r" + rotulo + ":");
        pilhaRotulos.push(rotulo);
        rotulo++;
    }

    private void action32(Token token) {
        if (token.getLexeme().equals("isTrueDo")) {
            codigo.add("brfalse r" + rotulo);
        } else {
            codigo.add("brtrue r" + rotulo);
        }

        pilhaRotulos.push(rotulo);
        rotulo++;
    }

    private void action33() {
        int rotulo1 = pilhaRotulos.pop();
        int rotulo2 = pilhaRotulos.pop();
        codigo.add("br r" + rotulo2);
        codigo.add("r" + rotulo1 + ":");
        pilhaRotulos.push(rotulo);
        rotulo++;
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