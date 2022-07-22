/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author E.N.D
 */
public class DominioYahoo implements Dominio {

    private String Dominio;

    @Override
    public void establecerDominio(String c) {
        Dominio = c;
    }

    @Override
    public String obtenerDominio() {
        return Dominio;
    }

}
