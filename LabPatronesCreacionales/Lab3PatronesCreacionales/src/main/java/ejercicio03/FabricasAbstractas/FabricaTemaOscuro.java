/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio03.FabricasAbstractas;

import Ejercicio3.Botones.BotonOscuro;
import Ejercicio3.Botones.InterfaceBoton;
import ejercicio03.Checkboxes.CheckboxOscuro;
import ejercicio03.Checkboxes.InterfaceCheckbox;

/**
 *
 * @author INTEL
 */
public class FabricaTemaOscuro extends FabricaAbstractaTema{

    @Override
    public InterfaceBoton CrearBoton() {
        System.out.println("Se crea boton de tema oscuro ");
       return new BotonOscuro(); 
    }

    @Override
    public InterfaceCheckbox CrearCheckbox() {
        System.out.println("Se crea checkbox de tema oscuro");
       return new CheckboxOscuro(); 
    }
    
}
