package Excercicio3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primeira nota: ");
        double nota = sc.nextDouble();
        System.out.println("Digite segunda nota: ");
        double seg = sc.nextDouble();
        System.out.println("Digite terceira nota: ");
        double ter = sc.nextDouble();

        double media = nota+seg+ter/3;

        System.out.println("A média é:" + media);
    }
}
