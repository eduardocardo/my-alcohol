
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    //indica el nombre del que bebe
    private String nombreBebedor ;
    //indica el valor tota del alcohol en sangre
    private int alcoholSangre;
    //indica la acumulacion de alcohol en sangre con cada copa
    private int contadorAlcoholSangre;
    //indica el limite de alcohol en sangre
    private int limit;
    

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String newNombreBebedor)
    {
       nombreBebedor         = newNombreBebedor;
       alcoholSangre         = 0;
       contadorAlcoholSangre = 0;
       limit                 = 15;
    }

    /**
     *Metodo para comprobar el nivel de alcohol en sangre
     */
    public void beberCopa(Cubata nombreCopa)
    {
        contadorAlcoholSangre= nombreCopa.getCantidad() ;//se almacena la cantidad de alcohol bebido
        alcoholSangre = alcoholSangre + contadorAlcoholSangre;//acumula alcohol en sangre tras beber copa
        
        if(alcoholSangre>limit)//supera el limite
        {
            System.out.println("No quiero mas copas");
        }    
        
    }  
    /**
     * Metodo 
     */
    public void preguntar(String pregunta)
    {
        int letrasPregunta; 
        letrasPregunta = pregunta.length();//calcula el numero de letras de la pregunta
        if(alcoholSangre<limit && !(pregunta.contains(nombreBebedor)))
        {
            if(letrasPregunta%2==0)//si el numero de letras es par
            {
                System.out.println("Si");
            }
            else //el numero de letras de la pregunta es impar
            {
                System.out.println("No");
            }   
        }
        else if(pregunta.contains(nombreBebedor)) //si la pregunta contiene el nombre del bebedor
        {
            System.out.println(pregunta.toUpperCase());
        }    
        
        else //supera el limite de alcohol 
        {
            System.out.println(pregunta.toUpperCase());
        }    
    }       
}
