package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.exemplo.contexto.estatico;

public class Classe {
    private String atributo;
    private static String atributoEstatico;

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public static String getAtributoEstatico() {
        return atributoEstatico;
    }

    public static void setAtributoEstatico(String atributoEstatico) {
        Classe.atributoEstatico = atributoEstatico;
    }
}
