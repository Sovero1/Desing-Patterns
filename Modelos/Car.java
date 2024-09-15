/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod.Modelos;

/**
 *
 * @author INTEL
 */
public class Car implements Vehicle{

    @Override
    public String start() {
        System.out.println("Arranca un Auto");
        return null;
    }

    @Override
    public String stop() {
        System.out.println("Se detiene el Auto");  
      return null;  
    }
    
}
