
package Patron2;

import Patron2.Boton;
public abstract class FabricaBoton {
    public abstract Boton crearBoton();
    
    public void verificarBoton(){
        Boton boton = crearBoton();
        boton.presionar();
    }
}
