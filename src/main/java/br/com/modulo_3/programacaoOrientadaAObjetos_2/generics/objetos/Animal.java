package br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos;

public interface Animal extends Comparable<Animal> {

    void informarPeso(Double peso);
    Double obterPeso();

    @Override
    default int compareTo(Animal o) {
        return this.obterPeso().compareTo(o.obterPeso());
    }

}
