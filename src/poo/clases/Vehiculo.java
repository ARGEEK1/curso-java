package poo.clases;

public class Vehiculo {
    // 1. atributos
    String fabricante;
    String modelo;
    double cc;
    int year;
    boolean sport;
    int velocidad;

    // 2. contructores
    // este contructor crearia un objeto vehiculo vacio, e incluso si no se declara ya existiria de forma inplicita.
    public Vehiculo() {
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.velocidad = 0;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // 2. metodos (comportamiento)
    public void acelerar(int aceleracion) {
        this.velocidad += aceleracion;
    }

    //getter y setters


    //toString
    @Override
    public String toString() {
        return "Vehiculo [fabricante = " + fabricante + ", modelo = " + modelo + ", cc = " + cc + ", year = " + year + ", sport = " + sport + ", velocidad = " + velocidad + "]";
    }
}
