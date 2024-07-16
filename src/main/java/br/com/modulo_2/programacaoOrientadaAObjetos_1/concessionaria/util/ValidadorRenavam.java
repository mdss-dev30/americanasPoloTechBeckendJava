package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.util;

import java.util.Objects;

public class ValidadorRenavam {
    public static boolean validaRenavam(String renavam){
        String nula = null;
        String vazia = "";
        if (Objects.isNull(renavam) || renavam.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String nula = null;
        String vazia = new String("");


        if (Objects.isNull(nula)){
            System.out.println("é null");
        }


        if (nula.isEmpty()){
            System.out.println("é vazia");
        }
    }
}
