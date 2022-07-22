/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.Calculotv;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) {
       
        Televisor t1 = new Televisor();
        t1.establecerMarca("LG-14 pulgadas");
        t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor();
        t2.establecerMarca("SAMSUMG-21 pulgadas");
        t2.establecerPrecio(1300.2);

        Televisor t3 = new Televisor();
        t3.establecerMarca("RIVIERA-29 pulgadas");
        t3.establecerPrecio(2300.5);

        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);
        
        
        Calculotv cl = new Calculotv();
        cl.establecerTelevisor(tvs);
        cl.televisorMasCaro();
        cl.establecertotalPrecioTvs();
        
        System.out.printf("%s \n",cl);
        
        
        
        
      /*  System.out.println("-----------------");
        System.out.println("%.2f\n",t1.);
        System.out.printf("%.2f\n", t1.TotalPrecioTvs(tvs));
        System.out.printf("%s\n", t1.ListaMarcasVendidas(tvs));
*/
    }
}
