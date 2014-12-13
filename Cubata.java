
/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    //indica la cantidad de alcohol que lleva la copa
    private int cantidad ;
    //indica nombre de la copa
    private String nombreCopa;

    /**
     * Constructor for objects of class Cubata
     */
    public Cubata(String newNombreCopa,int newCantidad)
    {
        cantidad   = newCantidad;
        nombreCopa = newNombreCopa;
    }

    /**
     * metodo que devuelve la cantidad de alcohol
     */
   
    public int getCantidad()
    {
        return cantidad;
    } 
    
    /**
     * metodo que devuelve el nombre de la copa
     */
    public String getNombreCopa()
    {
        return nombreCopa;
    }   
}
