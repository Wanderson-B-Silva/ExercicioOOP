package Excercio14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = num * i;
            System.out.println("A tabuada do " + num + "x" + i +" é:" + tabuada);

        }
    }
}
