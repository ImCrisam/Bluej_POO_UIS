import java.util.*;
/**
 * PruebaComunicador
 *
 * 
 * @author  FRoM 
 * @version 2014
 */
public class PruebaComunicador
{
    public static void main( String[] args )
    {
        Comunicador com;
        List<Comunicador>mensaje = new ArrayList();
        int ops = 1;
                
        while(ops == 1)
        {
           
          com = FabricaComunicador.creaComunicador();     
          mensaje.add(com);
          ops = hasnest();
          
        
        }
        
        for (Comunicador mensajes : mensaje)
        {
          if( mensajes != null )
          {
             mensajes.enviaMensaje( );
             System.out.println(" Guardados " );
          }
            
            else
            System.out.println( "No se eligió una alternativa válida" );    
         }
    
    }
    
    private static int hasnest()
    {
        int ops;
        try 
        {
            
            Scanner sc = new Scanner( System.in );
            System.out.println( " Si deseas escribir otro mensaje escriba (1)  " );
            ops = sc.nextInt();
           
        }
        catch(InputMismatchException e)
        {
            System.out.println("no es entero lo tomare como un no.");
            return 0;
        }
        return ops;
    }
}

