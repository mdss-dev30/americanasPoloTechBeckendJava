package br.com.modulo_1.logicaDeProgramacao.Aula_05;

public class ExerciceArray {
    public static void main(String[] args) {
        int[] my_array1 =
                {1789, 2035, 1899, 1456, 2013,
                 1458, 2458, 1254, 1472, 2365,
                 1456, 2265, 1457, 2456};

        System.out.println(contains(my_array1, 1899));
    }
    public static boolean contains(int[] arr, int item) {
        for (int i :arr) {
            if(i == item){
                return true;
            }
        }
        return false;
    }
}
