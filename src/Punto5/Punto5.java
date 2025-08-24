package Punto5;

/**
 *
 * @author marti
 */
public class Punto5 {
    public static void main(String[] args) { 
    NaveEspacial nave1 = new NaveEspacial();
    
        nave1.setNombre("Atlantis");
        nave1.setCombustible(50);
        
        nave1.despegar();
        nave1.avanzar(80);
        nave1.recargarCombustible(40);
        nave1.despegar(); 
        nave1.avanzar(20);
        nave1.mostrarEstado();
    }
}
