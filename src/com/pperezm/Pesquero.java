package com.pperezm;

public class Pesquero implements Barco
{
    private int eslora;
    private double potencia;
    private int pescadores;
    String nombre;
    public Pesquero(int tripulacion)
    {
        pescadores = tripulacion;
        System.out.println("Se crea objeto Barco Pesquero.");
    }

    public Pesquero() {

    }

    public void alarma()
    {
        System.out.println("¡¡¡Alarma desde el pesquero " +
                nombre + " !!!");
    }
    public void msgeSocorro(String av)
    {
        System.out.println("¡¡¡SOS SOS!!!, " + av);
    }
}
