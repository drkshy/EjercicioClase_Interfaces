package com.pperezm;

public class Main {
/*
@author Pablo Arturo Pérez Mata
@email pablo.arturo.perez@gmail.com
@description Practica de creación de interfaces
*/

    public static void main(String[] args) {
	// write your code here
       BarcoPasaje miBarcoPasaje = new BarcoPasaje();
       miBarcoPasaje.msgeSocorro("Ayuda");
        miBarcoPasaje.alarma();
        PortaAvion miPortaAvion = new PortaAvion();
       miPortaAvion.msgeSocorro("Ayuda");
        miPortaAvion.alarma();
        Pesquero miPesquero = new Pesquero();
        miPesquero.alarma();
       miPesquero.msgeSocorro("Ayuda");

    }

}
