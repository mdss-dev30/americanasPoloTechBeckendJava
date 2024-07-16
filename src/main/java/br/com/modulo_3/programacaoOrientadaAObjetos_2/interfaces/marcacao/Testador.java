package br.com.modulo_3.programacaoOrientadaAObjetos_2.interfaces.marcacao;

import java.util.Arrays;
import java.util.List;

public class Testador {

    public static void main(String[] args) {

        List animais = Arrays.asList(new Ornitorrinco(), new Papagaio(), new Tucano());

        for (Object animal : animais) {

            String clazzName = animal.getClass().getSimpleName();

            if (isAve(animal)) {
                System.out.println("O animal " + clazzName + " é uma Ave e pode voar!");
            } else {
                System.out.println("O animal " + clazzName + "não é uma Ave e não pode voar!");
            }

        }
        

    }

    public static boolean isAve(Object obj) {
        return obj instanceof Ave;
    }


}
