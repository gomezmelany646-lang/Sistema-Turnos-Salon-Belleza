package ar.edu.unahur.obj2.peluqueria;

public class CorteDeCabello extends Servicios{
 public CorteDeCabello (double precioBase, int cupoDisponible)
 {
    super (precioBase,cupoDisponible);
 }
 @override 
 protected string codigo () {return "COR"};
}
