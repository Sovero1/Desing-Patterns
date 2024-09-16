/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adaptadores;

import Motores.Motor;
import Motores.MotorElectrico;

/**
 *
 * @author INTEL
 */
public class MotorElectricoAdapter implements Motor{
    
    //Referencia a la clase que se va a adaptar
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        super();
        System.out.println("Creando Motor Electrico adapter");
        this.motorElectrico = new MotorElectrico();
    }
    
    

    @Override
    public void encender() {
        System.out.println("Motor Encendido");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Acelerando");
    }

    @Override
    public void apagar() {
         System.out.println("Motor Apagado");
         this.motorElectrico.desconectar();
         this.motorElectrico.desactivar();
    }
    
}
