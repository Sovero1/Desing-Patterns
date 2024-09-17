package inicial.ejercicio02;

import ejercicio02.Boton;
import factories.FabricaWindows;


public class Main {
    public static void main(String[] args) {
        String sistemaOperativo = "Windows";

        if (sistemaOperativo.equals("Windows")) {
            Boton botonw = new BotonWindows();
            botonw.render();
        } else if (sistemaOperativo.equals("Mac")) {
            Boton botonM = new BotonMac();
            botonM.render();
        }
    }
}
