/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;

import Pantalones.pantalonDeportivo;
import Productos.Camisa;
import Productos.Pantalon;
import Productos.Zapato;
import Zapatos.ZapatoDeportivo;
import camisa.camisaDeportiva;

/**
 *
 * @author IALAB
 */
public class fabricaRopaDeportiva implements FabricaRopa{

    @Override
    public Zapato hacerZapato() {
               return new ZapatoDeportivo(); 
    }

    @Override
    public Camisa hacerCamisa() {
             return new camisaDeportiva();   
    }

    @Override
    public Pantalon hacerPantalon() {
              return new pantalonDeportivo(); 
    }
    
}
