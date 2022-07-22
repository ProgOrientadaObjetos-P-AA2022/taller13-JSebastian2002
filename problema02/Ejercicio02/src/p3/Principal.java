/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.Matricula;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> mt = new ArrayList<>();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerPromedioTarifas();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerPromedioTarifas();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerPromedioTarifas();
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerPromedioTarifas();
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerPromedioTarifas();
        
   
        
        TipoMatricula mt2 = new TipoMatricula();
        mt2.establecerMatriculas(mt);
        mt2.establecerPromedio();
 
        System.out.printf("%s\n", mt2);
    }
}
