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
    private double precioTotal;
    private ArrayList<Televisor>tv;
    private String x;
    private double c;
    
    public void establecerTv(ArrayList<Televisor>t){
        tv = t;
    }
    public ArrayList<Televisor> obtenerTv(){
        return tv;
    }
    
    public void establecerPrecioTotal(){
     double s = 0;
        for (int i = 0; i < tv.size(); i++) {
            s = s + tv.get(i).obtenerPrecio();
            
        }
        precioTotal = s;
    }
    public double obtenerPreciotoal(){
        return precioTotal;
    }
    
    public void listaMarcasVendidas(){
        String s = "";
        for (int i = 0; i < tv.size(); i++) {
            s = String.format("%s%s\n", s, tv.get(i).obtenerMarca());
        }
        x = s;
    }
    public String obtenerMaracasVendidas(){
        return x;
    }
  
     public void televisorMasCaro(){
        double s = 0;
        // pass
         for (int i = 0; i < tv.size(); i++) {
             if (tv.get(i).obtenerPrecio()>s) {
                 s = tv.get(i).obtenerPrecio();
             }
             c=s;
         }
       
    }
     public double obtenertelevisorMasCaro(){
         return c;
     }
    
}
