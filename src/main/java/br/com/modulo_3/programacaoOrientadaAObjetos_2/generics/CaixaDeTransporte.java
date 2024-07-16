package br.com.modulo_3.programacaoOrientadaAObjetos_2.generics;


import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Animal;

public class CaixaDeTransporte<T extends Animal> {

    private T objeto;

    public void colocarNaCaixa(T objeto) {
        System.out.println("Colocando " + objeto.getClass().getSimpleName() + " na Caixa");
        this.objeto = objeto;
    }

    public T pegarObjetoDaCaixa() {
        return this.objeto;
    }

}
