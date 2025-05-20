package Excercio15;
import java.util.Scanner;
public class Main {
    public void CalculoImc () {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite seu altura: ");
        double altura = sc.nextDouble();
        double imc = peso/(altura*altura);

        System.out.printf("\n O resutado do seu IMC é: %.1f\n", imc);

        if (imc < 18.5) {
            System.out.printf( "Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
                System.out.printf("Acima do peso");

        }
        sc.close();



    }




}
