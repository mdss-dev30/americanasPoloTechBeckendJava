package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.exemplo.heranca.bemfeita;

// É UMA
public class PessoaJuridica extends Pessoa{

    // atributos especificos da classe filha
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}