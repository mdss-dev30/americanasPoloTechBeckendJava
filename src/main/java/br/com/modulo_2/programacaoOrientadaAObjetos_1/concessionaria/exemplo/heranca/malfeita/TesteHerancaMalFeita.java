package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.exemplo.heranca.malfeita;

public class TesteHerancaMalFeita {
    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("José");

        // pessoa late ou balança Rabo? Não! Isso é resultado de herança mau feita
        pj.latir();
        pj.balancarRabo();
    }
}
