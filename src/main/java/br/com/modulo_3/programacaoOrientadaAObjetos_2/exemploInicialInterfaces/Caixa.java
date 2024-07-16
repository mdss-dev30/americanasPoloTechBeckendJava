package br.com.modulo_3.programacaoOrientadaAObjetos_2.exemploInicialInterfaces;

public class Caixa<T> {
    private T valor;

    public void setValor(T valor) {
        this.valor = valor;
    }
    public T getValor() {
        return this.valor;
    }

    static void exemplo() {
        // Criei uma caixa de BOOLEAN, só pode boolean
        // Nesse caso a classe Caixa é genérica em função de Booleans
        Caixa<Boolean> caixaComBoolean = new Caixa<>();
        caixaComBoolean.setValor(true);
//        caixaComBoolean.setValor(0); // Erro, não é boolean
//        caixaComBoolean.setValor("não é boolean"); // Erro
    }
}
