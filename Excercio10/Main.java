package Excercio10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array de números a ser ordenado
        int[] numeros = {7, 3, 9, 1, 5, 2};

        // Exibe o array original
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Ordena o array em ordem crescente
        Arrays.sort(numeros);

        // Exibe o array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
