
import Fabrica.VehicleFactory;
import FactoryNormal.Vehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author INTEL
 */
public class Main {
    public static void main(String[] args) {
        VehicleFactory obj= new VehicleFactory();
    
        Vehicle objP= obj.createVehicle("plane");
        objP.start();
        objP.stop();
    }
}
