package br.com.modulo_3.programacaoOrientadaAObjetos_2.generics;

import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Animal;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Bola;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Cachorro;
import br.com.modulo_3.programacaoOrientadaAObjetos_2.generics.objetos.Gato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestadorDeParametros {

    public static void main(String[] args) {

        List<Animal> animais = Arrays
                .asList(new Gato(10.00), new Cachorro(20.00), new Gato(5.00), new Cachorro(7.00));

        int maisPesados = contadorDeAnimaisMaisPesados(animais, new Cachorro(6.00));

        System.out.println("Animais mais pesados: " + maisPesados);
        exibirPesoDosAnimais(animais);

        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro(5.00));
        cachorros.add(new Cachorro(15.00));

        // Não compila, o tipo esperado é List<Animal> e não List<Cachorro>
//        exibirPesoDosAnimais(cachorros);

        // Funciona, pois a classe Cachorro implementa a interface Animal
        exibirPesoDosQueImplementamAnimal(cachorros);

        // Funciona, pois o é metodo espera uma lista
        adicionandoOutrosObjetosNaLista(cachorros);

        // Aqui acontece um erro em tempo de execução, pois adicionamos um objeto na lista que não implementa Animal
        exibirPesoDosQueImplementamAnimal(cachorros);

    }

    // Permite adicionar qualquer tipo dentro da lista, pois a mesma não é tipada
    public static void adicionandoOutrosObjetosNaLista(List animais) {
        animais.add(new Bola());
    }

    // Aceita todas as listas de objetos que implementam a interface Animal
    // Porém não pode ser adicionado nada nessa lista
    public static void exibirPesoDosQueImplementamAnimal(List<? extends Animal> animais) {
//        não compila
//        animais.add(new Cachorro());
        for (Animal animal : animais) {
            System.out.println("Peso: " + animal.obterPeso());
        }
    }

    public static void exibirPesoDosAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println("Peso: " + animal.obterPeso());
        }
    }

    // https://docs.oracle.com/javase/tutorial/java/generics/boundedTypeParams.html
    public static <T extends Comparable<T>> int contadorDeAnimaisMaisPesados(List<T> lista, T objeto) {

        int contador = 0;
        for (T e : lista) {
            if (e.compareTo(objeto) > 0) {
                contador++;
            }
        }
        return contador;
    }





}
