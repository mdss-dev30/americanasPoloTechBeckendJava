package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.testes;

import br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.modelo.Carro;
import br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.util.ValidadorRenavam;
import br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.enumerador.EnumMarcaCarro;


import java.util.Calendar;

public class TesteCarro {

    public static void save(Carro carro){
        /* salvando o carro no banco, lá muita coisa aocntece
        são validadas muitas regras no banco (Constraints)*/
    }
    public static void main(String[] args) {
        Carro carro1 = new Carro(EnumMarcaCarro.FIAT);

        Carro carro2 = new Carro(EnumMarcaCarro.FERRARI);

        Carro carro3 = new Carro(EnumMarcaCarro.FIAT);

        int qtde = carro2.getQuantidadeCarrosInstanciados();

        int qtde2 = Carro.getQuantidadeCarrosInstanciados(); // quando costuma ser usado um metodo static?
        // quando temos:
        //  - static factory method  - metodo de fabrica de objetos
        // - metodos utilitarios

        Calendar instance = Calendar.getInstance();
        //CarroFactory.getInstance(EnumTipoCarro.TUNADO);
        //CarroFactory.getInstance(EnumTipoCarro.ESPORTIVO);

        System.out.println(qtde2);

        carro3.setRenavam("123456789-89");
        ValidadorRenavam.validaRenavam(carro3.getRenavam());
        // seguir o fluxo


        carro1.setModelo("SUV");
        carro1.setCor("PRETO");
        carro1.setNumeroDeRodas(5);
        carro1.setAroRoda(19);
        carro1.setAnoDeFabricao(2022);
        carro1.setDono("Michael Douglas");
        carro1.setEstiloDeCombustivel("Gasolina");
        carro1.setMotor("180 Cavalos");
        carro1.setPreco(170_000.00);
        carro1.setVelocidadeMaxima(230);

       System.out.println(carro1.getNumeroDeRodas());

        System.out.println(carro1.obterVelocidadeMaxima());
        carro1.ligar();
        carro1.acelerar(120);
        System.out.println(carro1);

        carro1.acelerar(30);
        System.out.println(carro1);

        carro1.morrer();
        System.out.println(carro1);

        Carro carro4 = new Carro();


        carro2.setMarca(EnumMarcaCarro.MERCEDES);
        carro2.setModelo("GOL");
        carro2.setCor("AZUL");
        carro2.setNumeroDeRodas(5);
        carro2.setAroRoda(18);
        carro2.setAnoDeFabricao(2015);
        carro2.setDono("Diego");
        carro2.setEstiloDeCombustivel("Gasolina");
        carro2.setMotor("8 valvulas");
        carro2.setPreco(35_000.00);

        System.out.println(carro2);
        System.out.println(qtde);
        System.out.println(qtde);




    }
}
