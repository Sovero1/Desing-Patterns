/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod.Modelos;

/**
 *
 * @author INTEL
 */
public class Motorcycle implements Vehicle{

    @Override
    public String start() {
        System.out.println("Arranca una Motocicleta");
        return null; 
    }

    @Override
    public String stop() {
        System.out.println("Se detiene Motocicleta");
        return null;
    }
    
}
