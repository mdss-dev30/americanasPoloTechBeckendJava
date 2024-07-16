package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.testes;

import br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.enumerador.EnumMarcaMoto;
import br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.modelo.Moto;
import br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.util.ValidadorChassi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteMoto {
    public static void main(String[] args) {

        // usando o set, se torna verboso

       /* Moto moto1 = new Moto();
        moto1.setMarca(EnumMarcaMoto.HONDA);
        moto1.setModelo("CB1000");
        moto1.setCor("Verde");
        moto1.setEscapamento("Esportivo");
        moto1.setPlaca("TYH-2545");
        moto1.setCilindrada(1_000);
        moto1.setVelocidadeMaxima(280);
        moto1.setPreco(40_000.00);

        */


//        System.out.println(moto1);

//        System.out.println(moto1.getPlaca());
//        System.out.println(moto1.getCor());

        // usando o construtor
        // 1 - dificuldade no preenchimento
        // 2 - respeitar a ordem dos tipos
        // 3 - temos memoria curta, acabamos esqucendo a que se refere cada valor informado

        //Moto moto2 = new Moto("Verde", "Yamawha", 500, "BBB-0878", "CRB500", "Tunado", 20_000.00, 500);

        // Design Pattern -> Builder (faz parte do grupo dos padrões Criacionais)
        // 1 - dificuldade no preenchimento -> X
        // 2 - respeitar a ordem dos tipos -> X
        // 3 - temos memoria curta, acabamos esqucendo a que se refere cada valor informado -> X
        // 4 - usando o set, se torna verboso -> X


        // teste com entrada do teclado

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("informe o numero de motos que deseja cadastrar");
        int numeroDeMotos = sc.nextInt();

        List<Moto> motos = new ArrayList<>();

        for (int i = 0; i < numeroDeMotos; i++) {
            System.out.println("informe a cor");
            String cor = sc.next();

            Moto moto = new Moto.MotoBuilder()
                    .cor(cor)
                    .escapamento("Tunado")
                    .preco(20_000.00)
                    .marca(EnumMarcaMoto.YAMAHA)
                    .velocidadeMaxima(500)
                    .cilindrada(500)
                    .placa("RRR-8575")
                    .modelo("Yamawha")
                    .build();

            motos.add(moto);
        }

        for (Moto moto :motos) {
            System.out.println(moto);
        }
        */

        Moto moto3 = new Moto.MotoBuilder()
                .cor("preto")
                .escapamento("Tunado")
                .preco(20_000.00)
                .velocidadeMaxima(500)
                .marca(EnumMarcaMoto.YAMAHA)
                .cilindrada(500)
                .placa("RRR-8575")
                .modelo("Yamawha")
                .chassi("5025050505")
                .renavam("45456456")
                .build();

        System.out.println(moto3);

        System.out.println(moto3.getTipoCambio());


//        List<Moto> motos2 = List.of(moto3, moto3, moto3);
//        System.out.println(motos2.size());
    }

}
