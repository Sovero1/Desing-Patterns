/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod.Factories;

import FactoryMethod.Modelos.Truck;
import FactoryMethod.Modelos.Vehicle;

/**
 *
 * @author INTEL
 */
public class TruckFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
       return new Truck();
    }
    
}
