package compilador.furb.compiler;

public class Token {
    private final int id;
    private final String lexeme;
    private final int position;

    public Token(int id, String lexeme, int position) {
        this.id = id;               // classe codificada
        this.lexeme = lexeme;       // sequência reconhecida
        this.position = position;   // posição inicial da sequência
    }

    public final int getId() {
        return id;
    }

    public final String getLexeme() {
        return lexeme;
    }

    public final int getPosition() {
        return position;
    }

    public final String getTokenClass() {
        return switch (getId()) {
            case Constants.t_palavra,
                    Constants.t_and,
                    Constants.t_endIf,
                    Constants.t_endWhile,
                    Constants.t_false,
                    Constants.t_finish,
                    Constants.t_if,
                    Constants.t_in,
                    Constants.t_isFalseDo,
                    Constants.t_isTrueDo,
                    Constants.t_newLine,
                    Constants.t_not,
                    Constants.t_or,
                    Constants.t_out,
                    Constants.t_space,
                    Constants.t_start,
                    Constants.t_tab,
                    Constants.t_true,
                    Constants.t_while -> "Palavra reservada";

            case Constants.t_id_int,
                    Constants.t_id_float,
                    Constants.t_id_string,
                    Constants.t_id_bool -> "Identificador";

            case Constants.t_int -> "Constante int";

            case Constants.t_float -> "Constante float";

            case Constants.t_string -> "Constante string";

            case Constants.t_TOKEN_28,
                    Constants.t_TOKEN_29,
                    Constants.t_TOKEN_30,
                    Constants.t_TOKEN_31,
                    Constants.t_TOKEN_32,
                    Constants.t_TOKEN_33,
                    Constants.t_TOKEN_34,
                    Constants.t_TOKEN_35,
                    Constants.t_TOKEN_36,
                    Constants.t_TOKEN_37,
                    Constants.t_TOKEN_38,
                    Constants.t_TOKEN_39,
                    Constants.t_TOKEN_40,
                    Constants.t_TOKEN_41,
                    Constants.t_TOKEN_42,
                    Constants.t_TOKEN_43 -> "Símbolo especial";

            default -> "Desconhecido";
        };
    }

    public String toString() {
        return id + " ( " + lexeme + " ) @ " + position;
    }
}
