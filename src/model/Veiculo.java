
package model;

public abstract class Veiculo {

    private String placa;
    private String modelo;
    private double diaria;

    public Veiculo(String placa, String modelo, double diaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.diaria = diaria;
    }

    public abstract double calcularAluguel(int dias);

    public void imprimirResumo() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
    }

    public double getDiaria() {
        return diaria;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }
}
