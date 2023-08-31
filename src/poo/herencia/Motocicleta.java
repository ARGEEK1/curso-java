package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    public boolean baul;
    public Motocicleta () {}

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, motor);
        this.baul = baul;
    }
}
