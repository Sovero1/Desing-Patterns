/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import ejercicio02.Boton;
import inicial.ejercicio02.BotonMac;

/**
 *
 * @author INTEL
 */
public class FabricaMac implements FabricaBotones {

    @Override
    public Boton createButton() {
        System.out.println("Creando botones para Mac");
        return new BotonMac();
    }

   
    
}
