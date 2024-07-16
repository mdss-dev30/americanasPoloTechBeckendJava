package br.com.modulo_1.logicaDeProgramacao.Aula_05;

public class ExampleMatriz {
    public static void imprimeMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i][j] = (int) (Math.random() *100); //para popular com numeros aleatórios
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
/*
    Saída esperada *na quantidade do recebina por parametros

    ex: 10,10

0  0  0  0  0  0  0  0  0  0
0  0  0  0  0  0  0  0  0  0
0  0  0  0  0  0  0  0  0  0
0  0  0  0  0  0  0  0  0  0
0  0  0  0  0  0  0  0  0  0
0  0  0  0  0  0  0  0  0  0
0  0  0  0  0  0  0  0  0  0
0  0  0  0  0  0  0  0  0  0
0  0  0  0  0  0  0  0  0  0
0  0  0  0  0  0  0  0  0  0

 */