package br.com.modulo_3.programacaoOrientadaAObjetos_2.exemploInicialInterfaces;

public abstract class Animal implements Comparable<Animal> {

    public int getNumeroDeOlhos() {
        return numeroDeOlhos;
    }

    public void setNumeroDeOlhos(int numeroDeOlhos) {
        this.numeroDeOlhos = numeroDeOlhos;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    private int numeroDeOlhos; //
    private double peso; //
    private double tamanho; //
    private String habitat; //
    private String tipoAlimentacao; //
    private String especie; //

    @Override
    public String toString() {
        return "Animal{numeroDeOlhos=" + numeroDeOlhos +
                ", peso=" + peso +
                ", tamanho=" + tamanho +
                ", habitat='" + habitat + '\'' +
                ", tipoAlimentacao='" + tipoAlimentacao + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        if (this.peso > o.peso) {
            return 1;
        } else if (this.peso == o.peso) {
            return 0;
        } else {
            return -1;
        }
    }
}
