package Excercio17;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1; // número entre 1 e 100
        int tentativa;
        int tentativas = 0;

        System.out.println("=== Jogo ===");
        System.out.println("adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("O número é MAIOR.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("O número é MENOR.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
            }

        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}

