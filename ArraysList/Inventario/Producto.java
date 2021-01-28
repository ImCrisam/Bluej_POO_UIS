/**
 * Model some details of a product sold by a company.
 * 
 * @author FRoM - Ibrahim Delkairo Jimenez
 * @version 2012.06.25
 */
public class Producto
{
    // Un número de identificador para este producto
    private int id;
    // El nombre de este producto.
    private String nombre;
    // La cantidad de productos en el inventario
    private int cantidad;

    /**
     * Constructor de objetos de la clase de producto.
     * La cantidad de stock inicial es cero.
     * @param id Número de identificación del producto.
     * @param name El nombre del producto.
     */
    public Producto(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
        cantidad = 0;
    }

    /**
     * @return El id del producto.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return El nombre del producto.
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @return La cantidad en el inventario.
     */
    public int getCantidad()
    {
        return cantidad;
    }

    /**
     * @return El id,nombre y cantidad en el inventario.
     */
    public String toString()
    {
        return id + ": " +
               nombre +
               " nivel del inventario: " + cantidad;
    }

    /**
     * Repoblar con la cantidad dada de este producto.
     * La cantidad del producto actual (this) se incrementa en la cantidad dada.
     * @param cantidad El número de nuevos items a ser agregados al inventario.
     *        Debe ser mayor que cero.
     */
    public void aumentarCantidad(int cantidad)
    {
        if(cantidad > 0) 
        {
            this.cantidad+= cantidad;
        }
        else 
        {
            System.out.println("Error digito " +
                               nombre +
                               " con una cantidad negativa: " +
                               cantidad);
        }
    }

    /**
     * Vender uno de los productos
     * Un error se reporta si no hay disponibles
     */
    public void venderUno()
    {
        if(cantidad > 0) 
        {
            cantidad--;
        }
        else 
        {
            System.out.println(
                "No se pudo vender ya que no hay en el inventario de este producto: " + nombre);
        }
    }
}
