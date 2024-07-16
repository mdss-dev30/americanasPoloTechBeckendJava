package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.exemplo.contexto.estatico;

public class TesteContextoEstatico {
    public static void main(String[] args) {
        Classe objeto1 = new Classe();
        objeto1.setAtributo("1");
        objeto1.setAtributoEstatico("valor 1");

        Classe objeto2 = new Classe();
        objeto2.setAtributo("2");
        objeto2.setAtributoEstatico("valor 2");

        System.out.println(objeto1.getAtributo());
        System.out.println(objeto2.getAtributo());

        System.out.println(objeto1.getAtributoEstatico());

    }
}
