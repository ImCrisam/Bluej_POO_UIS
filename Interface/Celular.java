
/**
 * Celular
 *
 * 
 * @author  FRoM 
 * @version 2014
 */
public class Celular extends Msn implements Comunicador
{
    public Celular(String mensa)
    {
       super(mensa); 
    }
    
    public void enviaMensaje(  )
    {
        System.out.println( getMsn() + "   Soy un celular enviando un mensaje" );
    }
    
    
}
