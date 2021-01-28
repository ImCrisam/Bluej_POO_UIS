
/**
 * Write a description of class libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class libro
{
    private short año;
    private String nombre;
    private String autor;
    
    public libro( short x,String y ,String z)
    {
        año = x;
        nombre = y;
        autor =z;
        
    }
    public short añoLibro(){
    return año;
    }
    public String nombreLibro (){
    return nombre;
    }
    public String autorLibro(){
    return autor;
    }
    
    public String nombreLibroMayus (){
    return Character.toUpperCase(nombre.charAt(0))+nombre.substring(1);
    }
    public String autorLibroMayus(){
    return Character.toUpperCase(autor.charAt(0))+autor.substring(1);
    }
    
}
