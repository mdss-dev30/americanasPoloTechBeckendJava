package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.exemplo.heranca.bemfeita;

public class PessoaDAO {
    public PessoaFisica findByEmail(PessoaFisica pessoaFisica){
        // metodo filtro que recebe: pessoaFisica.getEmail();
        return new PessoaFisica();
    }
}
