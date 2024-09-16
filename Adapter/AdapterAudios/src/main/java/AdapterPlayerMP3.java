
import AdapterPlayerIF.AdapterPlayerIF;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author INTEL
 */
public class AdapterPlayerMP3 implements AdapterPlayerIF {

    @Override
    public void start(String s) {
        System.out.println("Reproduciendo MP3" +s);
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo reproduccion");
    }

    @Override
    public void pause() {
        System.out.println("Reproduccion en Pausa");
    }
    
}
