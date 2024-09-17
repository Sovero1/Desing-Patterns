/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camisa;

import Productos.Camisa;

/**
 *
 * @author IALAB
 */
public class camisaElegante implements Camisa {

    @Override
    public boolean tieneMangasLargas() {
        System.out.println("Camisa elegante tiene mangas largas?-> SI"); 
        return true;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("Camisa elegante tiene botones?-> SI"); 
        return true;
    }
    
}
