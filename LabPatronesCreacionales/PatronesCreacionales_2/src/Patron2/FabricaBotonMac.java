
package Patron2;


public class FabricaBotonMac extends FabricaBoton {
    @Override
    public Boton crearBoton(){
        return new BotonMac();
    }
}
