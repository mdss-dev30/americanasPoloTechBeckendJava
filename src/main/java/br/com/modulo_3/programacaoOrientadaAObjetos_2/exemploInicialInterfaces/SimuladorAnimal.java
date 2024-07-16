package br.com.modulo_3.programacaoOrientadaAObjetos_2.exemploInicialInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimuladorAnimal {
    public static void main(String[] args) {

        Animal cao = new Cachorro();
        Animal cao2 = new Cachorro();
        cao.setEspecie("cachorro");
        cao2.setEspecie("cachorro2");
        cao.setPeso(5);
        cao2.setPeso(10);
        Animal nemo = new Peixe();
        nemo.setPeso(3);
        nemo.setEspecie("peixe");
        Animal nemo2 = new Peixe();
        nemo2.setEspecie("peixe2");
        nemo2.setPeso(2.5);
        Animal perry = new Ornitorrinco();
        perry.setEspecie("ornitorrinco");
        perry.setPeso(30);
        Animal garfield = new Gato();
        garfield.setEspecie("gato");
        garfield.setPeso(9);
        Animal loro = new Papagaio();
        loro.setEspecie("papagaio");
        loro.setPeso(4.5);

        List listaAnimais = Arrays.asList(cao, nemo, nemo2, perry, garfield, loro, cao2);

        Collections.sort(listaAnimais);
//        Collections.reverse(listaAnimais);
//        List animaisOrdenadosPorEspecie = new ArrayList();

        for (Object animal : listaAnimais) {
            System.out.println(((Animal)animal).getPeso());
            // testa se animal é AnimalQueNada
            // operador binário ( que toma dois valores )
            // ObjetoParaComparar instanceof Tipo/Classe/Interface
//            if (animal instanceof AnimalQueNada animalQueNada) {
////                colocarNaPiscina(animalQueNada);
//            }
            // para cada animal em listaAnimais retorna um animal
//            printAtributos((Animal) animal);
        }
    }
    public static void printAtributos(Animal animal) {
        // como o metodo toString foi definido é só passar o animal
//        System.out.println(animal);
//        if (animal.isTemAsas()) {
//            animal.voar();
//        }
//        colocarNaPiscina("string1", "string2", "string3");
    }

    public static void colocarNaPiscina(AnimalQueNada animalQueNada) {
        System.out.println("Colocando animal na piscina" + animalQueNada.getClass().getSimpleName());
    }
}
