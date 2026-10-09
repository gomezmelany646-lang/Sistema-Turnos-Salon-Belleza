package ar.edu.unahur.obj2.peluqueria;

public class Coloracion extends Servicios {
    public Coloracion (double precioBase, int cupoDisponible){
        super (precioBase,cupoDisponible);
    }
    @override 
    protected String codigo(){
        return "COL";

    }
    public void avisoDeRetoque()
    // esto le avisa al cliente su retoque en 30 dias, registrandolo

}
