package Excercicio1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        System.out.println("Digite um valor: ");
        int n2 = sc.nextInt();

        int soma = n + n2;

        System.out.println("A Soma é: " + soma);
    }
}
