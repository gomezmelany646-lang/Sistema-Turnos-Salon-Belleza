package ar.edu.unahur.obj2.peluqueria.Clientes;

public class Clientes {
    private String nombre;
    private Categoria categoria;
    private list <Turno> historialDeTurnos = new ArrayList<>();

    public Cliente (String nombre, Categoria categoria);
    {
        this.nombre = nombre;
        this.categoria = categoria;
    }
    public void  SacarUnTurno (Turno turno){
        historialDeTurnos.add(turno)
    }
    public List <turno> getHistorial (){
        if (historialDeTurnos.isEmpty()){
            throw new ClientesSinTurnoException();
        }
        return historialDeTurnos;
        // devolviendome la lista sin modificar
    } 
    public double importeTotal (double importe ){
        return categoria.importeTotal(importe);
    }
    public  double CostoTotal(double costoTotal){
        return historialDeTurnos.mapToDouble(Turno::getImporteTotal).sum()
        //recoore todos los turns del clientes y los suma para obteener el valor total
    }
    public  void cambiarCategoria(Categoria nuevaCategoria){
        this.categoria = nuevaCategoria;
    }
}
