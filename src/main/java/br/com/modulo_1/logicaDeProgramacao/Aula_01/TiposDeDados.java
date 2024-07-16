package br.com.modulo_1.logicaDeProgramacao.Aula_01;

public class TiposDeDados {
    public static void tiposDeDados() {
        byte bite = 127;                     //(1 byte): -128 a 127
        short curto = 32767;                 //2 bytes): -32.768 a 32.767
        int inteiro = 10;                    //4 bytes): -2.147.483.648 a 2.147.483.647
        double preco = 10.0;                 //double (8 bytes): aprox. +- 1.797691313486231570E+308 (15 dígitos decimais significativos)
        float preco2 = 5.65F;                //(4 bytes): aprox. +- 3.40282347E+38F (6-7 dígitos decimais significativos)
        long longo = 9223372036854775807L;   // (8 bytes): -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        char caracter = 'M';                 //caractér (entre aspas simples '')
        boolean boleano =  false;            //true ou false
        final String constante= "imutável";  //constante
        String cadeia = "Douglas";           //cadeia de caractes (imutável) entre (aspas duplas "")


        System.out.println(bite);
        System.out.println(curto);
        System.out.println(inteiro);
        System.out.println(preco);
        System.out.println(preco2);
        System.out.println(longo);
        System.out.println(caracter);
        System.out.println(cadeia);
        System.out.println(boleano);
        System.out.println(constante);
    }
}
