package Punto5;

/**
 *
 * @author marti
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    private final double MAX_COMBUSTIBLE = 100.00 ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible <= MAX_COMBUSTIBLE) {
            this.combustible = combustible;  
        } else {
            this.combustible = MAX_COMBUSTIBLE;
        }
    }
    
    public void despegar() { 
        if(combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " despego. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible");
        } 
    }
    
    public void avanzar(double distancia) {
        double consumo = distancia * 0.5;
        if(combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " km ");
        } else {
            System.out.println("No hay suficiente combustible");
        }
    }
    
    public void recargarCombustible(double cantidad) {
        if(combustible + cantidad <= MAX_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Combustible recargado, nivel actual: " + combustible);
        } else {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("La recarga excede el limite, nivel actual: " + combustible);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible " + combustible + "/" + MAX_COMBUSTIBLE);
    }
    
}
