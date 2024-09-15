/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import FactoryMethod.Factories.CarFactory;
import FactoryMethod.Factories.TrainFactory;
import FactoryMethod.Modelos.Vehicle;


/**
 *
 * @author INTEL
 */
public class Main {
    public static void main(String[] args) {
       Vehicle car1= new CarFactory().createVehicle();
       Vehicle train1 = new TrainFactory().createVehicle();
       car1.start();
       car1.stop();
       train1.start();
       train1.stop();
    }
}
