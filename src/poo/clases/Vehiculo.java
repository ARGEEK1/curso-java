package poo.clases;

public class Vehiculo {
    // 1. atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int velocidad;
    protected Motor motor;

    // 2. contructores
    // este contructor crearia un objeto vehiculo vacio, e incluso si no se declara ya existiria de forma inplicita.
    public Vehiculo() {
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.velocidad = 0;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // 2. metodos (comportamiento)
    public void acelerar(int aceleracion) {
        this.velocidad += aceleracion;
    }

    //getter y setter


    //toString
    @Override
    public String toString() {
        return "Vehiculo [fabricante = " + fabricante + ", modelo = " + modelo + ", cc = " + cc + ", year = " + year + ", sport = " + sport + ", velocidad = " + velocidad + ", motor = " + motor + "]";
    }
}
