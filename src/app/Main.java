
package app;

import model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("ABC1234", "Toyota Corolla", 150);
        Moto moto1 = new Moto("DEF5678", "Honda CG", 80);
        Moto moto2 = new Moto("GHI9012", "Yamaha Fazer", 80);
        CarroEletrico eletrico = new CarroEletrico(
            "JKL3456", "Tesla Model 3", 200, 10
        );

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(carro);
        veiculos.add(moto1);
        veiculos.add(moto2);
        veiculos.add(eletrico);

        System.out.println("=== LOCADORA ESTRADA LIVRE ===");

        for (Veiculo v : veiculos) {
            int dias = 3;

            if (v == moto1) {
                dias = 4;
            } else if (v == moto2) {
                dias = 5;
            }

            v.imprimirResumo();
            System.out.println("Dias: " + dias);
            System.out.printf("Aluguel: R$ %.2f%n",
                    v.calcularAluguel(dias));
            System.out.println("----------------------");
        }

        System.out.println("=== RECARGA ===");

        ArrayList<Eletrico> eletricos = new ArrayList<>();
        eletricos.add(eletrico);

        for (Eletrico e : eletricos) {
            System.out.printf("Recarga: R$ %.2f%n",
                    e.calcularRecarga(3));
        }
    }
}
