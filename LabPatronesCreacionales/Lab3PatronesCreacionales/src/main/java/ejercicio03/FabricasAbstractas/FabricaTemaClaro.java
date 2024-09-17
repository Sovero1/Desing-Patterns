/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio03.FabricasAbstractas;

import Ejercicio3.Botones.BotonClaro;
import Ejercicio3.Botones.InterfaceBoton;
import ejercicio03.Checkboxes.CheckboxClaro;
import ejercicio03.Checkboxes.InterfaceCheckbox;

/**
 *
 * @author INTEL
 */
public class FabricaTemaClaro extends FabricaAbstractaTema {

    @Override
    public InterfaceBoton CrearBoton() {
        System.out.println("Se crea boton de tema claro");
       return new BotonClaro();
    }

    @Override
    public InterfaceCheckbox CrearCheckbox() {
        System.out.println("Se crea checkbox de tema claro");
       return new CheckboxClaro(); 
    }
    
}
