
/**
 *
 * @author marti
 */
public class Punto2 {
    public static void main(String[] args) {
       Mascota mascota1 = new Mascota();
    
        mascota1.setNombre("Lisa"); 
        mascota1.setEspecie("Perro");
        mascota1.setEdad(3);
        
        mascota1.mostrarInfo();
        mascota1.cumpliAanios();
        mascota1.mostrarInfo();
    }
    
}
