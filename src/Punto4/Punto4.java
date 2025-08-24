/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto4;

/**
 *
 * @author marti
 */
public class Punto4 {
    public static void main(String[] args) { 
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.setIdGallina(100);
        gallina1.setEdad(1);
        gallina1.setHuevos(5);
        
        gallina2.setIdGallina(101);
        gallina2.setEdad(2);
        gallina2.setHuevos(8);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        gallina1.ponerHuevo();
        gallina1.envejecer();
        
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
    
}
