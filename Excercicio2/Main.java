package Excercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome Número inteiro: ");
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número impar");
        }

    }

}
