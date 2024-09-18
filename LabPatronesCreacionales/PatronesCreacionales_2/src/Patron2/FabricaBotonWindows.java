
package Patron2;
import Patron2.Boton;
import Patron2.FabricaBoton;
public class FabricaBotonWindows extends FabricaBoton {
    @Override
    public Boton crearBoton(){
        return new BotonWindows();
    }
}
