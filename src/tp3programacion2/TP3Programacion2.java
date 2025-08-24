package tp3programacion2;

public class TP3Programacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.setNombre("Martin");
        estudiante1.setApellido("Gomez");
        estudiante1.setCurso("Programacion II");
        estudiante1.setCalificacion(7.5);
        
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.0);
        estudiante1.bajarCalificacion(0.5);
        estudiante1.mostrarInfo();
    }
    
}
