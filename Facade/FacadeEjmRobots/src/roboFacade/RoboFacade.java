/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roboFacade;

import roboParts.RobotColor;
import roboParts.RobotCuerpo;
import roboParts.RobotMetal;

/**
 *
 * @author INTEL
 */
public class RoboFacade {
    private RobotColor color;
    private RobotCuerpo cuerpo;
    private RobotMetal metal;

    public RoboFacade() {
        this.color = new RobotColor();
        this.cuerpo = new RobotCuerpo();
        this.metal = new RobotMetal();
    }
    
    public void creacionRobot(String ColorEscogido, String MetalEscogido){
        cuerpo.crearCuerpoRobot();
        color.setColor(ColorEscogido);
        metal.setMetal(MetalEscogido);
        System.out.println("Se está creando su robot :D");
        
    }
}
