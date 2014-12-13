
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
    //indica el limite de alcohol en sangre
    private int limit;
    //indica si el bebedor esta consciente
    private boolean consciente;
    //indica el nombre de la ultima copa
    private String ultimaCopa;
    

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String newNombreBebedor)
    {
       nombreBebedor         = newNombreBebedor;
       alcoholSangre         = 0;
       limit                 = 15;
       consciente            = true;
       ultimaCopa            = null;
    }

    /**
     *Metodo para comprobar el nivel de alcohol en sangre
     */
    public void beberCopa(Cubata nombreCopa)
    {
        
        
        if(alcoholSangre>=limit)//supera el limite
        {
            System.out.println("No quiero mas copas");
            
        }
           
        else //no supera el limite
        {
            
            alcoholSangre = alcoholSangre + nombreCopa.getCantidad();//acumula alcohol en sangre tras beber copa
            if(ultimaCopa == nombreCopa.getNombreCopa())
            {
                consciente =false;
            }
            else
            {
                ultimaCopa= nombreCopa.getNombreCopa();
            }   
        }
        
        
    }  
    /**
     * Metodo 
     */
    public void preguntar(String pregunta)
    {
        int letrasPregunta; 
        letrasPregunta = pregunta.length();//calcula el numero de letras de la pregunta
        if(alcoholSangre>limit || (pregunta.contains(nombreBebedor)))
        {
            System.out.println(pregunta.toUpperCase());//responde repitiendo la pregunta gritando
        }
        else //el nivel de alcohol en sangre es menor que el limite y no contiene el nombre del bebedor
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
    } 
    /**
     * Metodo que devuelve si el bebedor esta consciente
     */
    public boolean getConsciente()
    {
        return consciente;
    }    
}
