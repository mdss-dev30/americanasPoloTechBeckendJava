package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.exceptions;

// não checada, é filha de RuntimeException, unchecked
// checada, dever ser filha de Exception, checked
public class StringVaziaException extends RuntimeException{

    public StringVaziaException(String msg){
        super(msg);
    }
}