package Excercio12;

public class Aluno extends Pessoa {
    private int matricula;


    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;

    }

    public void mostrarInformacao() {
        super.mostrarDados();
        System.out.println("Matricula: " + matricula);
    }

}