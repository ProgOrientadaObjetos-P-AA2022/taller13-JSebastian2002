/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class CalculoTv {
    
    private double totalPrecioTvs;
    private double televisorMasCaro;
    private ArrayList<Televisor> listaMarcasVendidas;
    
    
    public String establecerListaMarcasVendidas(ArrayList<Televisor> t){
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        return s;
    }
    public double establecerTotalPrecioTvs(ArrayList<Televisor> t){
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            s = s + t.get(i).obtenerPrecio();
            System.out.println(s);
        }
        return s;
    }
    public double establecerTelevisorMasCaro(ArrayList<Televisor> t){
        double s = 0;
        // pass
        return s;
    }
    
       public ArrayList<Televisor> listaMarcasVendidas(){
        return listaMarcasVendidas;
    }
    public double obtenerTotalPrecioTvs(){
        return totalPrecioTvs;
    }
    
    public double obtenerTelevisorMasCaro(){
        return televisorMasCaro;
    }
    
  
    
    
    
   
    
}
