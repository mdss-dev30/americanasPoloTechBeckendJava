package br.com.modulo_1.logicaDeProgramacao.Aula_05;

import java.util.Arrays;

public class ExampleArray {
    public static void main(String[] args) {
        String [] names = {"Maria", "Bob", "Vania", "Tania", "Gabriel"};
        System.out.println(names[1]);

        int[] a = new int[6];
        int[] b;
        b = new int[8];

        int[] r = new int[44], k = new int[23];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(r));
        System.out.println();

        for (String temp:names) {
            System.out.println(temp);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }

}
