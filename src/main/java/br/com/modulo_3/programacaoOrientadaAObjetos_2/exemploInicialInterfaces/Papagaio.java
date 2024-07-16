package br.com.modulo_3.programacaoOrientadaAObjetos_2.exemploInicialInterfaces;

public class Papagaio extends Animal implements AnimalQueAnda, AnimalQueVoa {
    private boolean temAsas;
    public boolean isTemAsas() {
        return temAsas;
    }

    public void setTemAsas(boolean temAsas) {
        this.temAsas = temAsas;
    }

    @Override
    public int obterNumeroDePernas() {
        return 0;
    }

    @Override
    public void andar() {
        System.out.println("Andando devagar");
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }
}
