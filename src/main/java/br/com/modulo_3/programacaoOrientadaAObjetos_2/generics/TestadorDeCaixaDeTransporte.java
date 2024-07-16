package br.com.modulo_3.programacaoOrientadaAObjetos_2.generics;

import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.*;

public class TestadorDeCaixaDeTransporte {

    public static void main(String[] args) {

        CaixaDeTransporte<Gato> caixaDeGato = new CaixaDeTransporte<>();
        caixaDeGato.colocarNaCaixa(new Gato());

        // Não compila; a caixa de transporte aceita apenas objetos que implementam a interface Animal
//        CaixaDeTransporte<Bola> caixaDeBola = new CaixaDeTransporte<>();


    }

}
