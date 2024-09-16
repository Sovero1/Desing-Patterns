package inicial.ejercicio02;

public class Main {
    public static void main(String[] args) {
        String sistemaOperativo = "Windows";

        if (sistemaOperativo.equals("Windows")) {
            BotonWindows boton = new BotonWindows();
            boton.render();
        } else if (sistemaOperativo.equals("Mac")) {
            BotonMac boton = new BotonMac();
            boton.render();
        }
    }
}
