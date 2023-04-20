package com.pperezm;

public class PortaAvion implements Barco
{
    private int aviones = 19;
    private int tripulacion;
    public PortaAvion()
    {
        int marinos= 20;
        tripulacion = marinos;
        System.out.println("Se crea objeto PortaAviones.");
    }
    public void alarma()
    {
        System.out.println("¡¡¡marineros a sus puestos!!!");
    }
    public void msgeSocorro(String av)
    {
        System.out.println("¡¡¡SOS SOS!!! " + av);
    }
}
