package br.com.modulo_1.logicaDeProgramacao.Aula_02;

import java.util.Arrays;
import java.util.Scanner;

public class MenorValor {
    static double valor_1, valor_2, valor_3;
    public static void recebeValores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primero valor:");
        valor_1 = sc.nextDouble();
        System.out.println("Digite o segundo valor:");
        valor_2= sc.nextDouble();
        System.out.println("Digite o terceiro valor:");
        valor_3 = sc.nextDouble();
        System.out.println("Os números digitados foram: " + valor_1 +", " + valor_2 + " e "+ valor_3);
        menorValor();
    }
    public static void menorValor(){
        double [] valores = {valor_1, valor_2, valor_3};
        System.out.println("O menor valor digitado foi: " + Arrays.stream(valores).min().getAsDouble());
    }
}
