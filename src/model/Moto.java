
package model;

public class Moto extends Veiculo {

    public Moto(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double total = getDiaria() * dias;

        if (dias >= 5) {
            total = total - (total * 0.15);
        }

        return total;
    }
}
