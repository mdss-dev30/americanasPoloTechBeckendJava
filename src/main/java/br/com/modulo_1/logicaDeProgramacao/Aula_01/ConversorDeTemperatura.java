package br.com.modulo_1.logicaDeProgramacao.Aula_01;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void conversor() {
        Scanner sc = new Scanner(System.in);

        float temperaturaConvertida = 0;

        System.out.println("Qual tipo de temperatura vc quer converter:");
        System.out.println("Digite 1 para converter de Fahrenheit para Celsius ");
        System.out.println("ou");
        System.out.println("Digite 2 para converter de Celsius para Fahrenheit");
        byte tipo = sc.nextByte();
        if(tipo == 1 || tipo == 2 ){
            System.out.println("Digite a temperatura: ");
            float temperatura = sc.nextFloat();
            if (tipo == 1){
                temperaturaConvertida = ((temperatura - 32) * 5) / 9;
                System.out.printf("A temperatura digitada convertida em Celsius é %.2f C", temperaturaConvertida);
            }else {
                temperaturaConvertida = ((temperatura * 9) / 5) + 32;
                System.out.printf("A temperatura digitada convertida em Fahrenheit é %.2f F", temperaturaConvertida);
            }
        }else {
            System.out.println("O valor digitado tem que ser 1 ou 2, tente novamente!");
        }

    }
}
