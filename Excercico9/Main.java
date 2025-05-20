package Excercico9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora ===");

        System.out.print("Qual operação deseja (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();


        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        float resultado;

        switch (operador) {
            case '+':
                resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (n1 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }

        scanner.close();
    }
}
