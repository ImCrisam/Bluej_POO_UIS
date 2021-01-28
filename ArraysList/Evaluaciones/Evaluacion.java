import java.io.Serializable;
/**
 * Write a description of class Evaluacion here.
 * 
 * @author FRoM 
 * @version 02/10/2012
 */
public class Evaluacion implements Serializable

{
    private String codigo;
    private String apellido1;
    private String apellido2;
    private String nombre;    
    private double nota;
    
    /**
     * Constructor for objects of class Evaluacion
     */
    public Evaluacion( String codigo, String apellido1, String apellido2, String nombre, double nota )
    {
        this.codigo = codigo;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.nota = nota;
    }
    
    /**
     * @return  devuelve codigo
     */
    public String getCodigo()
    {
        return "";
    }

    /**
     * @return  devuelve nombre
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * @return  devuelve apellido1
     */
    public String getApellido1()
    {
        return "";
    }
    
    /**
     * @return  devuelve apellido2
     */
    public String getApellido2()
    {
        return "";
    }

    /**
     * @return  devuelve la nota
     */
    public double getNota()
    {
        return nota;
    }
}
