package Excercio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a string ao usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Remove espaços extras e divide a string em palavras
        String[] palavras = frase.trim().split("\s+");

        // Conta e exibe o número de palavras
        int quantidade = (frase.trim().isEmpty()) ? 0 : palavras.length;
        System.out.println("Quantidade de palavras: " + quantidade);

        scanner.close();
    }
}

