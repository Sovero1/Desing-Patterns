/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Motores;

/**
 *
 * @author INTEL
 */
public class MotorEconomico implements Motor{

     @Override
    public void encender() {
        System.out.println("Motor Encendido");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Acelerando");
    }

    @Override
    public void apagar() {
         System.out.println("Motor Apagado");
    }
}
