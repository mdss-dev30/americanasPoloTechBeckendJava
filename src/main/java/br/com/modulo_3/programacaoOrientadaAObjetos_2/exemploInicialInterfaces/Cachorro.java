package br.com.modulo_3.programacaoOrientadaAObjetos_2.exemploInicialInterfaces;

public class Cachorro extends Animal implements AnimalQueAnda, AnimalQueNada {

    @Override
    public int obterNumeroDePernas() {
        return 4;
    }

    @Override
    public void nadar() {
        System.out.println("Nadando estilo cachorro");
    }
}
