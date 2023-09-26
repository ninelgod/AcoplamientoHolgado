
package acoplamientoholgado;

/**
 *
 * @author emiia
 */
public class Viajero {
    private Vehiculo vehiculo;
     public float velocidad;
    public Viajero(Vehiculo v,float vel) {
        this.vehiculo = v;
        this.velocidad = vel;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo v) {
        this.vehiculo = v;
    }
    public void empezarViaje(){
        System.out.println("EL VIAJE HA COMENZADO");
    }
}
