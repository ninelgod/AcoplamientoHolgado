
package acoplamientoholgado;

/**
 *
 * @author emiia
 */
public class AcoplamientoHolgado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v1 = new Auto();
        Vehiculo v2 = new Bicicleta();
        Vehiculo v3 = new Scooter();
        
        v1.mover(72);
        v2.mover(10);
        v3.mover(5);
        
       
    }
    
}
