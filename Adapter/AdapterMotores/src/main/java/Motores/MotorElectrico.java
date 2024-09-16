/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Motores;

/**
 *
 * @author INTEL
 */
public class MotorElectrico {
    private boolean conectado=false;

    public MotorElectrico() {
        System.out.println("Creando Motor electrico... ");
        this.conectado=false;
    }
    
    public void conectar(){
        System.out.println("Conectando Motor");
        conectado=true;
    }
    
    public void activar(){
        if(this.conectado=true){
        System.out.println("Activando Motor");
        }
        else
            System.out.println("Motor Desactivado");
    }
    public void moverMasRapido(){
      if(this.conectado=true){
        System.out.println("Moviendo más rapido el Motor");
        }
        else
            System.out.println("No se puede mover más rapido el Motor,esta desconectado");
    }
    
    public void desconectar(){
        System.out.println("Desconectando Motor");
        conectado=false;
    }
    
    public void desactivar(){
        if(this.conectado=false){
        System.out.println("Desactivando Motor");
        }
        else
            System.out.println("No se puede desactivar porque el Motor está Activado");
    }
}
