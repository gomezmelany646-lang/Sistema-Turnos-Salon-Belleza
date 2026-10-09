package ar.edu.unahur.obj2.peluqueria;

/**
 * Servicios
 */
public class Servicios {
private double precioBase;
private int cupoDisponible;

 public Servicios(double precioBase, int cupoDisponible)
 {
    if (precioBase < 0){
        throw new Exception();
 }
 this.precioBase=precioBase; 
 this.cupoDisponible = cupoDisponible;

}
public double getPrecioBase {
    return precioBase;
}
public int getCupoDisponible{
    return cupoDisponible
}
public int descontarCupos(int cantidad) {
    if (cantidad < cupoDisponible)
    {
        throw new mensajeException( "No hay cupos disponibles")
    }
    return cupoDisponible - cantidad ;

    } 
 public final String comprobante (int numero ){
    return "TRN-" + codigo()+ "-"+ numero;

 }
 protected String codigo();


}


