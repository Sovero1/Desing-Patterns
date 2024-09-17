/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;

import Productos.Camisa;
import Productos.Pantalon;
import Productos.Zapato;

/**
 *
 * @author IALAB
 */
public interface FabricaRopa {
    Zapato hacerZapato(); 
    Camisa hacerCamisa();
    Pantalon hacerPantalon();
}
