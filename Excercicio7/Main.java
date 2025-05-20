package Excercicio7;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 25, 8, 32, 7, 50, 19};

        int maior = numeros[0]; // assume que o primeiro é o maior inicialmente

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número do array é: " + maior);
    }
}
