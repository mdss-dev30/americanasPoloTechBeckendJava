package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.exemplo.heranca.bemfeita;

public class TesteHerancaBemFeita {

    public static void main(String[] args) {
        Pessoa pf = new PessoaFisica();
         pf.setEmail("xxpf@gmail.com");
         System.out.println(pf.getEmail());



        PessoaJuridica pj = new PessoaJuridica();
        pj.setEmail("xxpj@gmail.com");
        System.out.println(pj.getEmail());
    }
}