
package acoplamientoholgado;

/**
 *
 * @author emiia
 */
public class Bicicleta implements Vehiculo{

    @Override
    public void mover(float m) {
        System.out.println(mostrarVehiculo() + "moviendose a una velocidad de : " + m +" m/s"); 
    }
    public String mostrarVehiculo(){
        return "Bicicleta";
    }
}
