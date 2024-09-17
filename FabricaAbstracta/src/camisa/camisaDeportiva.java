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
public class camisaDeportiva implements Camisa{

    @Override
    public boolean tieneMangasLargas() {
        System.out.println("Camisa Deportiva tiene mangas largas? -> NO");
        return false;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("CamisaDeportiva tiene botones? -->NO");
        return false;
    }
    
}
