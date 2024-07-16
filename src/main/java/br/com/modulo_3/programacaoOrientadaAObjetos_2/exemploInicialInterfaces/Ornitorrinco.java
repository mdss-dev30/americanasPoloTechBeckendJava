package br.com.modulo_3.programacaoOrientadaAObjetos_2.exemploInicialInterfaces;

public class Ornitorrinco extends Animal implements AnimalQueNada, AnimalQueVoa, AnimalQueAnda {
    private boolean temAsas;
    public boolean isTemAsas() {
        return temAsas;
    }

    public void setTemAsas(boolean temAsas) {
        this.temAsas = temAsas;
    }
    public void voar() {
        System.out.println("Voando baixo");
    }
    public void nadar() {
        System.out.println("Nadando");
    }

    @Override
    public int obterNumeroDePernas() {
        return 4;
    }
}
