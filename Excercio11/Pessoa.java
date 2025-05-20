package Excercio11;

public class Pessoa {

    private String nome;
    private int idade;


    //construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public void mostrarIdade() {
        System.out.println("O nome é:" + nome);
    }

    //metodo para o nome
    public void mostrarNome() {
        System.out.println("Idade é:" + idade);
    }
}
