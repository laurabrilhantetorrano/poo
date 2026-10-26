
package model;

public class CarroEletrico extends Carro implements Eletrico {

    private double consumoDiario;

    public CarroEletrico(String placa, String modelo, double diaria, double consumoDiario) {
        super(placa, modelo, diaria);
        this.consumoDiario = consumoDiario;
    }

    @Override
    public double calcularAluguel(int dias) {
        return super.calcularAluguel(dias) + (15 * dias);
    }

    @Override
    public double calcularRecarga(int dias) {
        return dias * consumoDiario * 0.80;
    }
}
