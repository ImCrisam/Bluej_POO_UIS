import java.util.ArrayList;

/**
 * Gestionar las acciones en una empresa.
 * La acción es descrita por cero o más productos.
 * 
 * @author FRoM - Ibrahim Delkairo Jimenez
 * @version 2012.06.26
 */
public class AdministradorDeStock
{
    // Una lista de todos los productos
    private ArrayList<Producto> inventario;

    /**
     * Inicializa el inventario
     */
    public AdministradorDeStock()
    {
        inventario = new ArrayList<Producto>();
    }

    /**
     * Agrega un producto a la lista, verificando antes, que aún no exista en inventario.
     * 
     * @param item El item a ser agregado
     */
    public void agregaProducto( Producto item )
    {
        if( buscaProducto( item.getID() ) == null )
        {
            inventario.add( item );
        }
        else
        {
            System.out.println( "YA existe un Producto con ese identificador. El producto no fue agregado." );            
        }
    }

    /**
     * Recibe una entrega de un producto en particular.
         * Aumenta la cantidad del producto con la cantidad dada.
     * @param id El ID del producto.
     * @param cantidad La cantidad a aumentar.
     */
    public void recibeProducto( int id, int cantidad )
    {    
        Producto productoBuscado = buscaProducto( id );
        if( productoBuscado != null )
        {
            productoBuscado.aumentarCantidad( cantidad );
        }
        else
        {
            System.out.println( "NO existe un Producto con ese identificador." );
        }
    }

    /**
     * Intenta encontrar un producto en el inventario con el ID dado.
     * @return El producto que se identifique, 
     * o null si no hay ninguno con ese ID.
     */
    public Producto buscaProducto( int id )
    {
        for( Producto producto : inventario )
        {
            if( producto.getID() == id )
                return producto;
        }
        return null;
    }

    /**
     * Busca un producto con el ID dado, y devuelve cuantos artículos
     * hay en stock. 
     * Si el ID no coincide con ningún producto, devuelve cero.
     * @param id El ID del producto.
     * @return La cantidad de productos en el inventario.
     */
    public int cantidadEnStock( int id )
    {
        Producto producto = buscaProducto( id );
        if( producto != null ) 
            return producto.getCantidad();
        else
            return -1;
    }

    /**
     * Imprime los detalles de todos los productos
     */
    public void muestraDetallesProducto()
    {
        for( Producto producto : inventario )
        {
            System.out.println( producto.toString() );
        }
    }
    /**
     * @author cristian arias 
     * @2014
     */
    public boolean buscarproducto ( String nombre)
    
   {
      boolean produc = false;
      for( Producto producto : inventario )
        
      {
          
            if( producto.getNombre() == nombre )
               {
                   produc = true;
                   
               }
            
       
        
      }
       
      return produc;
   }
    
    
    
}