/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto4;

/**
 *
 * @author marti
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }
    
    public void ponerHuevo() {
        huevos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total " + huevos);
    }
    
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " envejecio, ahora tiene " + edad + " años");
    }
    
    public void mostrarEstado() {
        System.out.println("Gallina ID:" + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevos);
    }
        
    
}
