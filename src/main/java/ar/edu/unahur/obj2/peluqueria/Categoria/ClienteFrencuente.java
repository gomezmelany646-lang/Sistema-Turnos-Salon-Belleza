package ar.edu.unahur.obj2.peluqueria.Categoria;

public class ClienteFrencuente implements Categoria {
    @Override 
    public double importeTotal(double importe){
        return (importe * 0.90);
    }
    
}
