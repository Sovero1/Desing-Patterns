/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03.FabricasAbstractas;

import Ejercicio3.Botones.InterfaceBoton;
import ejercicio03.Checkboxes.InterfaceCheckbox;

/**
 *
 * @author INTEL
 */
public abstract class FabricaAbstractaTema {
    public abstract InterfaceBoton CrearBoton();
    public abstract InterfaceCheckbox CrearCheckbox();
    
}
