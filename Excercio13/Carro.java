package Excercio13;

public class Carro extends Veiculo {


    public Carro(String placa, String modelo) {
     super(placa, modelo);
    }

    public void Herança() {
        super.Acelerar();
        super.Frear();
    }
}