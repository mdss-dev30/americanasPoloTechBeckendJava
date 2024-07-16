package br.com.modulo_1.logicaDeProgramacao.Aula_04;

public class MediaNotasAluno {
    public static void mediaNota(int nota) {
        int notaEntrada = nota;
        char notaFinal;

        if (notaEntrada >= 90){
            notaFinal = 'A';
            System.out.println(notaFinal);
        } else if (notaEntrada >= 80) {
            notaFinal = 'B';
            System.out.println(notaFinal);
        } else if (notaEntrada >= 70) {
            notaFinal = 'C';
            System.out.println(notaFinal);
        }else if (notaEntrada >= 60){
            notaFinal = 'D';
            System.out.println(notaFinal);
        }else {
            notaFinal = 'E';
            System.out.println(notaFinal);
        }
    }
}
