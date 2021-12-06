package compilador.furb.compiler;

public interface ParserConstants {
    int START_SYMBOL = 44;

    int FIRST_NON_TERMINAL = 44;
    int FIRST_SEMANTIC_ACTION = 81;

    int[][] PARSER_TABLE = {
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2},
            {-1, -1, 41, 41, 41, 41, -1, -1, -1, -1, -1, -1, -1, -1, 41, 41, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 42, 42, 42, 42, -1, -1, -1, -1, 43, 43, -1, 43, 42, 42, 43, -1, -1, -1, -1, 42, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 7, 7, 7, 7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 8, 9, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 10, -1},
            {-1, -1, 3, 4, 5, 6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 36, 36, 36, 36, -1, -1, -1, -1, -1, -1, -1, -1, 39, 37, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 22, 22, 22, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 23, 23, 23, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, -1, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 27, 27, 27, 27, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 21, 21, 21, 21, -1, -1, -1, -1, 21, 21, -1, 21, 21, 21, 21, -1, -1, -1, -1, 21, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20},
            {-1, -1, 12, 12, 12, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, 15, -1, -1},
            {-1, -1, 17, 17, 17, 17, 17, 17, 17, -1, -1, -1, 17, -1, -1, -1, -1, -1, 17, 17, -1, -1, 17, -1, 17, 17, -1, -1, -1, 17, -1, -1, -1, -1, -1, -1, 17, 17, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, 18, -1, -1},
            {-1, -1, 44, 44, 44, 44, 44, 44, 44, -1, -1, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, 44, -1, 44, 44, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1},
            {-1, -1, 45, 45, 45, 45, -1, -1, -1, 46, 45, 45, -1, 45, 45, 45, 45, 45, -1, -1, 47, 45, -1, -1, -1, -1, 45, -1, 45, -1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, 45},
            {-1, -1, 48, 48, 48, 48, 48, 48, 48, -1, -1, -1, 50, -1, -1, -1, -1, -1, 48, 51, -1, -1, 48, -1, 48, 49, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, 48, 48, -1, -1, -1, -1, -1},
            {-1, -1, 52, 52, 52, 52, 52, 52, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, 52, -1, 52, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, 52, 52, -1, -1, -1, -1, -1},
            {-1, -1, 53, 53, 53, 53, -1, -1, -1, 53, 53, 53, -1, 53, 53, 53, 53, 53, -1, -1, 53, 53, -1, -1, -1, -1, 53, -1, 53, -1, 53, 54, 54, -1, 54, 54, -1, -1, -1, -1, 53, -1, 53},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, 56, -1, 57, 58, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 59, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, 59, -1, 59, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1},
            {-1, -1, 60, 60, 60, 60, -1, -1, -1, 60, 60, 60, -1, 60, 60, 60, 60, 60, -1, -1, 60, 60, -1, -1, -1, -1, 60, -1, 60, -1, 60, 60, 60, -1, 60, 60, 61, 62, -1, -1, 60, -1, 60},
            {-1, -1, 63, 63, 63, 63, 63, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, 63, -1, 63, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, 63, 63, -1, -1, -1, -1, -1},
            {-1, -1, 64, 64, 64, 64, -1, -1, -1, 64, 64, 64, -1, 64, 64, 64, 64, 64, -1, -1, 64, 64, -1, -1, -1, -1, 64, -1, 64, -1, 64, 64, 64, -1, 64, 64, 64, 64, 65, 66, 64, -1, 64},
            {-1, -1, 67, 67, 67, 67, 68, 69, 70, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, -1, -1, 72, -1, 73, -1, -1, -1, -1, 74, -1, -1, -1, -1, -1, -1, 75, 76, -1, -1, -1, -1, -1},
            {-1, -1, 77, 77, 77, 77, -1, -1, -1, 77, 77, 77, -1, 77, 77, 77, 77, 77, -1, -1, 77, 77, -1, -1, -1, -1, 77, 78, 77, -1, 77, 77, 77, -1, 77, 77, 77, 77, 77, 77, 77, -1, 77}
    };

    int[][] PRODUCTIONS = {
            {96, 24, 45, 46, 14, 97},
            {0},
            {43, 48, 104, 42},
            {3},
            {4},
            {5},
            {6},
            {51, 105, 50},
            {41, 48},
            {0},
            {49},
            {28, 7, 29, 49},
            {51, 105, 66},
            {41, 64},
            {0},
            {65},
            {28, 69, 29, 65},
            {69, 95, 68},
            {41, 67},
            {0},
            {43, 15, 69, 107},
            {0},
            {54, 34, 69, 63, 106},
            {51, 105, 55},
            {28, 69, 29},
            {0},
            {16, 30, 57, 108, 31},
            {64},
            {9, 98, 95, 41, 64},
            {22, 30, 67, 31},
            {15, 69, 109, 18, 46, 60, 11, 110},
            {17, 111, 46},
            {0},
            {27, 112, 69, 62, 113, 46, 12, 114},
            {17},
            {18},
            {53},
            {56},
            {58},
            {59},
            {61},
            {52, 47},
            {46},
            {0},
            {71, 70},
            {0},
            {10, 71, 102, 70},
            {21, 71, 103, 70},
            {72},
            {26, 92},
            {13, 93},
            {20, 71, 94},
            {75, 73},
            {0},
            {74, 90, 75, 91},
            {32},
            {33},
            {35},
            {36},
            {77, 76},
            {0},
            {37, 77, 82, 76},
            {38, 77, 83, 76},
            {79, 78},
            {0},
            {39, 79, 84, 78},
            {40, 79, 85, 78},
            {51, 115, 80},
            {7, 86},
            {8, 87},
            {9, 98},
            {19, 99},
            {23, 100},
            {25, 101},
            {30, 69, 31},
            {37, 79, 88},
            {38, 79, 89},
            {0},
            {28, 69, 29}
    };

    String[] PARSER_ERROR = {
            "",
            "esperado EOF",
            "esperado palavra",
            "esperado identificador",
            "esperado identificador",
            "esperado identificador",
            "esperado identificador",
            "esperado constante int",
            "esperado constante float",
            "esperado constante string",
            "esperado and",
            "esperado endIf",
            "esperado endWhile",
            "esperado false",
            "esperado finish",
            "esperado if",
            "esperado in",
            "esperado isFalseDo",
            "esperado isTrueDo",
            "esperado newLine",
            "esperado not",
            "esperado or",
            "esperado out",
            "esperado space",
            "esperado start",
            "esperado tab",
            "esperado true",
            "esperado while",
            "esperado \"[\"",
            "esperado \"]\"",
            "esperado \"(\"",
            "esperado \")\"",
            "esperado \"==\"",
            "esperado \"<>\"",
            "esperado \"=\"",
            "esperado \"<\"",
            "esperado \">\"",
            "esperado \"+\"",
            "esperado \"-\"",
            "esperado \"*\"",
            "esperado \"/\"",
            "esperado \",\"",
            "esperado \";\"",
            "esperado \":\"",
            "esperado start", //"<programa> inv�lido",
            "esperado  identificador  if  in  out  while  :", //"<declaracao_variaveis> inv�lido",
            "esperado  identificador  if  in  out  while", //"<lista_de_comandos> inv�lido",
            "esperado  identificador  endIf  endWhile  finish  if  in  isFalseDo  out  while  ", //"<lista_de_comandos_1> inv�lido",
            "esperado identificador", //"<lista_de_identificadores> inv�lido",
            "esperado  ,  ;", //"<lista_de_identificadores_1> inv�lido",
            "esperado  [  ,  ;", //"<lista_de_identificadores_2> inv�lido",
            "esperado identificador", //"<identificador> inv�lido",
            "esperado  identificador  if  in  out  while", //"<comando> inv�lido",
            "esperado identificador", //"<atribuicao> inv�lido",
            "esperado identificador", //"<atribuicao_1> inv�lido",
            "esperado  [  =", //"<atribuicao_2> inv�lido",
            "esperado in", //"<entrada> inv�lido",
            "esperado  identificador  constante string", //"<entrada_2> inv�lido",
            "esperado out", //"<saida> inv�lido",
            "esperado if", //"<selecao> inv�lido",
            "esperado  endIf  isFalseDo", //"<selecao_2> inv�lido",
            "esperado while", //"<repeticao> inv�lido",
            "esperado  isFalseDo  isTrueDo", //"<repeticao_2> inv�lido",
            "esperado  identificador  endIf  endWhile  finish  if  in  isFalseDo  out  while  :", //"<sufixo> inv�lido",
            "esperado identificador", //"<lista_de_variaveis> inv�lido",
            "esperado  )  ,", //"<lista_de_variaveis_1> inv�lido",
            "esperado  [  )  ,", //"<lista_de_variaveis_2> inv�lido",
            "esperado express�o", //"<lista_de_expressoes> inv�lido",
            "esperado  )  ,", //"<lista_de_expressoes_1> inv�lido",
            "esperado express�o", //"<expressao> inv�lido",
            "esperado express�o", //"<expressao_> inv�lido",
            "esperado express�o", //"<elemento> inv�lido",
            "esperado express�o", //"<relacional> inv�lido",
            "esperado express�o", //"<relacional_> inv�lido",
            "esperado  ==  <>  <  >", //"<operador_relacional> inv�lido",
            "esperado express�o", //"<aritmetica> inv�lido",
            "esperado express�o", //"<aritmetica_> inv�lido",
            "esperado express�o", //"<termo> inv�lido",
            "esperado express�o", //"<termo_> inv�lido",
            "esperado express�o", //"<fator> inv�lido",
            "esperado express�o", //"<fator_> inv�lido"
    };
}
