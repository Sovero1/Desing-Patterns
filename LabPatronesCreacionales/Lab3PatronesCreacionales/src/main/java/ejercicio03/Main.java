package inicial.ejercicio03;

import ejercicio03.Checkboxes.CheckboxOscuro;
import ejercicio03.Checkboxes.CheckboxClaro;
import Ejercicio3.Botones.BotonOscuro;
import Ejercicio3.Botones.BotonClaro;
import ejercicio03.FabricasAbstractas.FabricaTemaClaro;
import ejercicio03.FabricasAbstractas.FabricaTemaOscuro;

public class Main {
    public static void main(String[] args) {
        String tema = "Claro";
        
        
        if(tema.equalsIgnoreCase("Claro")){
            FabricaTemaClaro claro = new FabricaTemaClaro();
            claro.CrearBoton();
            claro.CrearCheckbox();
         
        }
        else if(tema.equalsIgnoreCase("oscuro")){
        FabricaTemaOscuro oscuro= new FabricaTemaOscuro();
        oscuro.CrearBoton();
        oscuro.CrearCheckbox();
    }
            
    }
}
