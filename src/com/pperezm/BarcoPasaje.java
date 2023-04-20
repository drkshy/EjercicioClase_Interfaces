package com.pperezm;

public class BarcoPasaje implements Barco
{
    private int eslora;
    private int numeroCamas = 101;
    public BarcoPasaje()
    {
        System.out.println("Se crea objeto BarcoPasaje.");
    }
    public void alarma()
    {
        System.out.println("¡¡¡Alarma del barco pasajero!!!");
    }
    public void msgeSocorro(String av)
    {
        alarma();
        System.out.println("¡¡¡SOS SOS!!!" + av);
    }


    }

