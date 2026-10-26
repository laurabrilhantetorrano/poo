
package model;

public class Carro extends Veiculo {

    public Carro(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = getDiaria() * dias;
        return total + (total * 0.10);
    }
}
