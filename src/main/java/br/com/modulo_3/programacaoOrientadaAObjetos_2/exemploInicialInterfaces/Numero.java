package br.com.modulo_3.programacaoOrientadaAObjetos_2.exemploInicialInterfaces;

public class Numero implements Comparable<Integer> {

    private int numero;
    @Override
    public int compareTo(Integer num) {
        if (this.numero > num) {
            return 1;
        } else if (this.numero == num) {
            return 0;
        } else {
            return -1;
        }
    }
}
