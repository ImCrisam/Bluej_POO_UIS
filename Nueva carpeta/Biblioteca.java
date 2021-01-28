
/**
 * Write a description of class Biblioteca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Biblioteca
{
    private libro libro_;
    
    

    /**
     * Constructor for objects of class Biblioteca
     */
    public Biblioteca(short x, String y, String z)
    {
      libro_ = new libro(x,y,z);
      
    }

   public void mostrarDatos(){
     System.out.println(libro_.nombreLibro());
     System.out.println(libro_.autorLibro());
     System.out.println(libro_.añoLibro());
    }
}
