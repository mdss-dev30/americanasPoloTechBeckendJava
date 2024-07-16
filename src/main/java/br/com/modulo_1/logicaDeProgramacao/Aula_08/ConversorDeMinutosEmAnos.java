package br.com.modulo_1.logicaDeProgramacao.Aula_08;

import java.util.Scanner;

public class ConversorDeMinutosEmAnos {

    public static void conversor() {
        final int anosEmMinutos = 525600;
        final int diasEmMinutos = 1440;
        Scanner sc = new Scanner(System.in);
        double anos, dias;

        System.out.println("Digite os minutos:");
        int minutos = sc.nextInt();

        anos = minutos / anosEmMinutos;
        dias =  (minutos/diasEmMinutos) - (anos * 365);

        System.out.printf("Os minutos digitados correspondem a %.2f anos e %.2f dias", anos, dias);
        System.out.println();

    }

}
