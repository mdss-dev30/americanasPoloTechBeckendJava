package br.com.modulo_3.programacaoOrientadaAObjetos_2.interfaces.funcional;


// É uma interface com um unico método abstrato
// Pode conter métodos default
// Pode conter métodos estáticos
@FunctionalInterface
public interface Autenticavel {

    boolean autenticar();

    default void metodoDefault() {
        System.out.println("Sou um método default; e posso ser usado em interfaces funcionais");
    }

    static void metodoEstatico() {
        System.out.println("Sou um método estático; e posso ser usado em interfaces funcionais");
    }




}
