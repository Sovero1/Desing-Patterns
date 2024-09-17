/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantalones;

import Productos.Pantalon;

/**
 *
 * @author IALAB
 */
public class pantalonDeportivo implements Pantalon{

    @Override
    public boolean tieneCierre() {
        return false;
    }

    @Override
    public boolean tieneBolsillo() {
        return false;
    }
    
}
