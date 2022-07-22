/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author SALA I
 */
public class Calculotv {

    double precioTotal;
    double Caro;
    private ArrayList<Televisor> tv;
    String masvendido;

    public double obtenerCaro() {
        return Caro;
    }

    public String obtenerMasvendido() {
        return masvendido;
    }

    public double obtenerPrecioTotal() {
        return precioTotal;
    }

    public void establecerTelevisor(ArrayList<Televisor> lista) {
        tv = lista;
    }

    public ArrayList<Televisor> obtenerTelevisor() {
        return tv;
    }

    public void establecertotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < tv.size(); i++) {
            s = s + tv.get(i).obtenerPrecio();

        }
        precioTotal = s;
    }

    public void televisorMasCaro() {
        double mayor = 0;
        for (int i = 0; i < tv.size(); i++) {
            if (tv.get(i).obtenerPrecio() > mayor) {
                mayor = tv.get(i).obtenerPrecio();
            }

        }

        Caro = mayor;

    }

    public void listaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < tv.size(); i++) {
            s = String.format("%s%s\n", s, tv.get(i).obtenerMarca());
        }
        masvendido = s;
    }

    @Override
    public String toString() {
        String cadena = String.format("Reporte Televisores");
        for (int i = 0; i < tv.size(); i++) {
            cadena = String.format("%s\n"
                    + "%s - Precio: %.2f ",
                    cadena, obtenerTelevisor().get(i).obtenerMarca(),
                    obtenerTelevisor().get(i).obtenerPrecio());
        }

        cadena = String.format("%s"
                + "\nTotal Precio televiosores: %.2f\n"
                + "Televisor mas caro: %.2f\n", cadena, precioTotal,
                Caro);
        return cadena;
    }
}