/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryNormal;

/**
 *
 * @author INTEL
 */
public class Plane implements Vehicle{

    @Override
    public String start() {
        System.out.println("Arranca Avion");
        return null;
    }

    @Override
    public String stop() {
        System.out.println("Se detiene Avion");
       return null;
    }
    
    
}
