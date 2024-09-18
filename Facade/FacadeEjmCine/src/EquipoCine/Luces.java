package EquipoCine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author INTEL
 */
public class Luces implements Operacion{

    @Override
    public void encender() {
       System.out.println("Luces : ON"); 
    }

    @Override
    public void apagar() {
        System.out.println("Luces : OFF");
    }
    
}
