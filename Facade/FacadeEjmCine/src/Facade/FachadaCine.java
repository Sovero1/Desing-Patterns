/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;
import EquipoCine.Amplificador;
import EquipoCine.Luces;
import EquipoCine.Pantalla;
/**
 *
 * @author INTEL
 */
public class FachadaCine {
   private Amplificador amp;
   private Luces luc;
   private Pantalla pant;

    public FachadaCine() {
        this.amp = new Amplificador();
        this.luc = new Luces();
        this.pant = new Pantalla();
    }
   
   public void empezarPelicula(){
       System.out.println("La funcion esta iniciando");
       amp.encender();
       luc.apagar();
       pant.encender();
   }
   
   public void terminarPelicula(){
       System.out.println("La funcion está finalizando");
       amp.apagar();
       luc.encender();
       pant.apagar();
   
   }
}
