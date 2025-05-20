package Excercio12;

public class Pessoa {

    private String nome;
    private int idade;


    //construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public void mostrarDados() {
        System.out.println("O nome é:" + nome);
        System.out.println("Idade é:" + idade);
    }

}
