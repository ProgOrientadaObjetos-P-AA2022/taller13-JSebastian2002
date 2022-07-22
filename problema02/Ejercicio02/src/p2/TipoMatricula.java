/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    protected double promedio;
    ArrayList<Matricula>matriculas = new ArrayList<>();
    //private MatriculaCampamento campamento;
    //private MatriculaColegio colegio;
    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;
    
   /* public void establecerMatriculaCampamento(MatriculaCampamento c){
        campamento = c;
    }
    
    public void establecerMatriculaColegio(MatriculaColegio c){
        colegio = c;
    }
    
    public MatriculaCampamento obtenerMatriculaCampamento(){
        return campamento;
    }
    
    public MatriculaColegio obtenerMatriculaColegio(){
        return colegio;
    }
    
    public void establecerPromedioTarifas(){
        promedioMatriculas = (obtenerMatriculaCampamento().obtenerTarifa() + 
                obtenerMatriculaColegio().obtenerTarifa())/2;
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;

    }
*/
    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

   

    public double obtenerPromedio() {
        return promedio;
    }

    public void establecerPromedio() {
        double suma=0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma=suma+obtenerMatriculas().get(i).obtenerPromedioTarifas();
            
        }
        promedio=suma/obtenerMatriculas().size();
    }

    @Override
    public String toString() {
      String  cadena=String.format("Lista de Tarifas\n");
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            cadena=String.format("%sTarifas de matricilas%.2f\n"
                    ,
                    cadena,
                    obtenerMatriculas().get(i).obtenerPromedioTarifas());
            
        }
        cadena=String.format("%sTotal promedios:%.2f\n",
                cadena, obtenerPromedio());
      return cadena;
    }
         
}

