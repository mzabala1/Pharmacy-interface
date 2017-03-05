/**
 * Creo una clase medicamento que permita añadir el nombre de estos..
 * 
 * @author (Mateo Alexander Zabala Gutierrez) 
 * @version (9/06/2015)
 */
public class Medicamento
{
    private String nombre;
    private String tipo;
    private String ubicacion;
    private String casillero;
    
    public Medicamento(String nombre, String tipo, String ubicacion, String casillero)
    {
       this.nombre = nombre;
       this.tipo = tipo;
       this.ubicacion = ubicacion;
       this.casillero = casillero;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public String getCasillero(){
        return casillero;
    }
}