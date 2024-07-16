package br.com.modulo_3.programacaoOrientadaAObjetos_2.exemploInicialInterfaces;

public interface AnimalQueAnda {
    // não precisa colocar modificador de acesso, sempre é public e abstract
    int obterNumeroDePernas();
    default void andar() {
        System.out.println("Andando");
    }
}
