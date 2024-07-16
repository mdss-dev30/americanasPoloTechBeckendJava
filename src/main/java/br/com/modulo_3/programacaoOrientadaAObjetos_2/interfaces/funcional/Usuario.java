package br.com.modulo_3.programacaoOrientadaAObjetos_2.interfaces.funcional;

public class Usuario implements Autenticavel{

    @Override
    public boolean autenticar() {
        return Math.random() * 100 > 5;
    }


}
