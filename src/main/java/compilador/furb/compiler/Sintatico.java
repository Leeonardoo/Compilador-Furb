package compilador.furb.compiler;

import java.util.Stack;

import static compilador.furb.compiler.ParserConstants.*;

public class Sintatico implements Constants {
    private final Stack<Integer> stack = new Stack<>();
    private Token currentToken;
    private Token previousToken;
    private Lexico scanner;
    private Semantico semanticAnalyser;

    private static boolean isTerminal(int x) {
        return x < FIRST_NON_TERMINAL;
    }

    private static boolean isNonTerminal(int x) {
        return x >= FIRST_NON_TERMINAL && x < FIRST_SEMANTIC_ACTION;
    }

    private static boolean isSemanticAction(int x) {
        return x >= FIRST_SEMANTIC_ACTION;
    }

    private boolean step() throws LexicalError, SyntaticError, SemanticError {
        if (currentToken == null) {
            int pos = 0;
            if (previousToken != null)
                pos = previousToken.getPosition() + previousToken.getLexeme().length();

            currentToken = new Token(DOLLAR, "$", pos);
        }

        int x = stack.pop();
        int a = currentToken.getId();

        if (x == EPSILON) {
            return false;
        } else if (isTerminal(x)) {
            if (x == a) {
                if (stack.empty())
                    return true;
                else {
                    previousToken = currentToken;
                    currentToken = scanner.nextToken();
                    return false;
                }
            } else {
                throw new SyntaticError(PARSER_ERROR[x], currentToken.getPosition());
            }
        } else if (isNonTerminal(x)) {
            //noinspection SuspiciousNameCombination
            if (pushProduction(x, a))
                return false;
            else
                throw new SyntaticError(PARSER_ERROR[x], currentToken.getPosition());
        } else // isSemanticAction(x)
        {
            semanticAnalyser.executeAction(x - FIRST_SEMANTIC_ACTION, previousToken);
            return false;
        }
    }

    private boolean pushProduction(int topStack, int tokenInput) {
        int p = PARSER_TABLE[topStack - FIRST_NON_TERMINAL][tokenInput - 1];
        if (p >= 0) {
            int[] production = PRODUCTIONS[p];
            //empilha a produção em ordem reversa
            for (int i = production.length - 1; i >= 0; i--) {
                stack.push(production[i]);
            }
            return true;
        } else
            return false;
    }

    public void parse(Lexico scanner, Semantico semanticAnalyser) throws LexicalError, SyntaticError, SemanticError {
        this.scanner = scanner;
        this.semanticAnalyser = semanticAnalyser;

        stack.clear();
        stack.push(DOLLAR);
        stack.push(START_SYMBOL);

        currentToken = scanner.nextToken();

        while (!step())
            ;
    }
}
