import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;

/**
 * Todolist mantiene una lista de tareas por realizar.
 * Las tareas son enumeradas para referencia externa de usuarios.
 * 
 * Se basa en el proyecto tareabook de David J. Barnes and Michael Kolling.
 * FRoM - 2015
 */
public class Todolist
{
    // Almacena una cantidad arbitraria de tareas
    private ArrayList<String> tareas;

    /**
     * Inicializa arreglo y llama a inicioTareas()
     */
    public Todolist()
    {
        tareas = new ArrayList<String>();
        iniciaTareas();
    }
    public ArrayList<String> getList(){return tareas;}
    

    /**
     * Lee las tareas pendientes de un archivo "tareas.txt" y las muestra al usuario.
     */
    public void iniciaTareas()
    {
       try
       { 
            Scanner sc = new Scanner(new  FileReader("tareas.txt "));
            while(sc.hasNext())
            {
                String temp = sc.nextLine();
                tareas.add(temp);   
            }
       }
       catch (FileNotFoundException e)
       {
         
       }
      
    }

    /**
     * Guarda las tareas actuales en el archivo "tareas.txt"
     */
    public void guardaTareas() 
    {
        try
        {
        
            BufferedWriter salida = new BufferedWriter(new FileWriter ("tareasG.txt") );
            
            Iterator iorr = tareas.iterator();
            while(iorr.hasNext())
            {
                
                String tempp = (String)iorr.next();   
                salida.write(tempp ) ;  
            }
            
        }
       catch(IOException e)
       {
           
       }
    }

    /**
     * Encuentra y muestra la tarea de acuerdo al subindice ingresado por el usuario.
     * 
     * @param subIndice subindice de la tarea a buscar.
     * @return  tarea asociada al subindice ingresado.
     */
    public String buscaTarea( int subIndice )
    {
        
        if(tareas.size()>subIndice){
        return tareas.get(subIndice);
        } else{
        return null;
        }               
        
    }

    /**
     * Encuentra y muestra tareas donde se encuentra la palabra ingresada por el usuario.
     * 
     * @param   palabra  palabra que va a ser buscada en las tareas.
     * @return  Arreglo con tareas donde la palabra ha sido encontrada.
     */
    public ArrayList<String> buscaTareas( String palabra )
    {
        ArrayList<String> tareasEncontradas = new ArrayList<>();
        try
        {
        String task = "";
        String word = " ";
        int indice=0;
        Iterator rat = tareas.iterator();
        while(rat.hasNext())
        {   task = (String)rat.next();
            StringTokenizer st = new StringTokenizer(task);
          
         while(st.hasMoreTokens())
         {
             word =(String)st.nextToken();
          if (palabra.equals(word))
          {
              tareasEncontradas.add(indice+". "+task);
              
              
           
          }   
         }
         indice++;
        }
       }
       catch(NullPointerException e){System.out.println("no ha escrito nada"); return null; }


        
      return tareasEncontradas;  
    }

    /**
     * Si existe tarea con el subindice proporcionado la elimina de la coleccion.
     * 
     * @param nTarea    Subindice de la tarea a remover.
     */
    public void eliminaTarea( int nTarea )
    {
        int asd = tareas.size();
        
        if( nTarea >= asd){System.out.println("no hay tantas tareas");}
        else if( nTarea < 0 )
        { System.out.println("numero negativo");
        }
        else if (nTarea >= 0){tareas.remove(nTarea);}
        
        
        
    }

    /**
     * Lista todas las tareas en la coleccion mostrando sus subindices.
     */
    public void listaTareas()
    {
        int indice = 0;
        for( String tarea : tareas )
        {
            System.out.println( indice + ". " + tarea );
            indice++;
        }
    }

    /**
     * Almacena una tarea nueva en la coleccion.
     * 
     * @param tarea  tarea a ser agregada.
     */
    public void agregaTarea( String tarea )
    {
        tareas.add( tarea );
    }

    /**
     * @return  La cantidad actual de tareas en la coleccion.
     */
    public int cantiTareas()
    {
        return tareas.size();
    }

    /**
     * Entrega lista de tareas actual
     */
    public ArrayList getTareas()
    {
        return tareas;
    }
}
