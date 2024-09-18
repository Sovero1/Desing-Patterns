package EquipoCine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author INTEL
 */
public class Pantalla implements Operacion {

    @Override
    public void encender() {
        System.out.println("Pantalla : ON");
    }

    @Override
    public void apagar() {
       System.out.println("Amplificador : OFF");
    }
   
}
