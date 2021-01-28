
/**
 * PruebaComunicadores
 *
 * 
 * @author  FRoM 
 * @version 2014
 */
public class PruebaComunicadores
{
    public static void main( String[] args )
    {
        Comunicador celular1 = new Celular( "hola" );
        Comunicador celular2 = new Celular("como estas");
        Comunicador celular3 = new Celular("bien y tu");
        Comunicador paloma1 = new PalomaMensajera("Alerta de guerra");        
        Comunicador paloma2 = new PalomaMensajera("4 triguers por el north");    
        
        Comunicador[] coms = { celular1, celular2, celular3, paloma1, paloma2 };
               
    }
}
