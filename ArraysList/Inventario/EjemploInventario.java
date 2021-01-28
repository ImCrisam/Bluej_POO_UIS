/**
 * Demostración de las clases administradorDeStock y Producto.
 * La demostración puede vloverse adecuadamente funcional al
 * completar la clase administradorDeStock.
 * 
 * @Ibrahim FRoM - Delkairo Jimenez
 * @version 2012.06.26
 */
public class EjemploInventario
{
    // El Manejador de Inventario
    private AdministradorDeStock manejador;

    /**
     * Crea un administradorDeStock y se llena con
     * algunos productos de ejemplos.
     */
    public EjemploInventario()
    {
        manejador = new AdministradorDeStock();
        manejador.agregaProducto( new Producto( 132, "Radio de Reloj") );
        manejador.agregaProducto( new Producto( 37,  "Telefono Celular") );
        manejador.agregaProducto( new Producto( 23,  "Microondas wave") );
    }

    /**
     * Proporciona una demostración muy simple de cómo un administradorDeStock
         * Podría ser utilizado. Se muestran detalles de un producto, el producto es 
     * realmacenado, y los detalles se vuelven a mostrar.      
     */
    public void demo()
    {
        // Muestra los detalles de todos los productos
        manejador.muestraDetallesProducto();
        // Toma la entrega de 5 items de uno de los productos
        manejador.recibeProducto( 132, 50 );        
        manejador.muestraDetallesProducto();
    }

    /**
     * Mostrar los detalles de un producto determinado. Si lo encuentra,
         * Su nombre y la cantidad de acciones se muestran.
     * @param id El ID del producto que se busca.
     */
    public void muestraDetalles( int id )
    {
        Producto producto = getProducto( id );
        if( producto != null ) 
        {
            System.out.println( producto.toString( ) );
        }
    }

    /**
     * Vender uno de los elementos dado.
         * Mostrar el antes y el después de la situación del producto.
     * @param id El ID del producto que se va a vender.
     */
    public void venderProducto(int id)
    {
        Producto producto = getProducto(id);

        if(producto != null) 
        {
            muestraDetalles(id);
            producto.venderUno();
            muestraDetalles(id);
        }
    }

    /**
     * Obtiene el producto con el identificador dado desde el administrador.
         * Un mensaje de error se imprime si no hay ninguna coincidencia.
     * @param id El ID del producto.
     * @return El Producto, o null si no encuentra concidencia.
     */
    public Producto getProducto(int id)
    {
        Producto producto = manejador.buscaProducto(id);
        if(producto == null) 
        {
            System.out.println("Producto con ID: " + id +
                " no se reconoce.");
        }
        return producto;
    }

    /**
     * @return El manejador.
     */
    public AdministradorDeStock getManejador()
    {
        return manejador;
    }
}
