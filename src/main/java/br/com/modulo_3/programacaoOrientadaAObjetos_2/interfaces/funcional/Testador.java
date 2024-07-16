package br.com.modulo_3.programacaoOrientadaAObjetos_2.interfaces.funcional;

import java.util.Random;

public class Testador {

    public static void main(String[] args) {

        Autenticavel usuario = new Usuario();

        // Classe anonima
        // https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
        Autenticavel autenticavel = () -> new Random().nextInt() > 0;

        autenticar(usuario);
        autenticar(autenticavel);

    }

    public static void autenticar(Autenticavel autenticavel) {

        String clazzName = autenticavel.getClass().getSimpleName();
        boolean autenticado = autenticavel.autenticar();
        if (autenticado) {
            System.out.println(clazzName + " autenticado com sucesso");
        } else {
            System.out.println(clazzName + " não autenticado");
        }

    }

}
