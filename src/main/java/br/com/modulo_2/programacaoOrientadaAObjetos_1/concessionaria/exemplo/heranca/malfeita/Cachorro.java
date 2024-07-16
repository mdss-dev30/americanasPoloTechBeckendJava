package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.exemplo.heranca.malfeita;

public class Cachorro {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected void latir(){
        System.out.println("Latindo...");
    };

    protected void balancarRabo(){
        System.out.println("Balançando o rabihno...");
    };
}