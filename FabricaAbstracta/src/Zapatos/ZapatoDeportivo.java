/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zapatos;

import Productos.Zapato;

/**
 *
 * @author IALAB
 */
public class ZapatoDeportivo implements Zapato {

    @Override
    public boolean esElegante() {
        
        System.out.println("");
        return false;
    }

    @Override
    public boolean esDeportivo() {
        return false;
    }
    
}
