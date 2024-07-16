package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.util;

import java.util.Objects;

public class ValidadorChassi {

    public static boolean validaChassi(String chassi){
        if (Objects.isNull(chassi) || chassi.isEmpty()){
            return false;
        }
        return true;
    }
}
