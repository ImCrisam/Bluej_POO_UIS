import java.util.ArrayList;
/**
 * TestTareas
 *
 * 
 * @author  FRoM 
 * @version 2014
 */
public class TestTareas
{
    public TestTareas()
    {
    }

    public static void main( String[] args )
    {
        Todolist listaTareas = new Todolist();
        int nTareas = listaTareas.cantiTareas();
        System.out.println( "Hay " + nTareas + " tareas almacenadas" );
        System.out.println( "Las tareas son:" );
        listaTareas.listaTareas();

        listaTareas.agregaTarea( "Leer la Palabra de Dios" );
        listaTareas.agregaTarea( "Orar" );
        listaTareas.agregaTarea( "Meditar" );        
        System.out.println( "Nueva lista:" );
        listaTareas.listaTareas();

        int subindice = 1;
        listaTareas.buscaTarea( subindice );          
        System.out.println( "Tarea en " + subindice + ": " + listaTareas.buscaTarea( subindice ) ); 
        subindice = - 1;
        System.out.println( subindice + " no es subindice valido" ); 
        subindice = listaTareas.cantiTareas() - 1;
        System.out.println( "Tarea en " + subindice + ": " + listaTareas.buscaTarea( subindice ) ); 
        subindice = listaTareas.cantiTareas();        
        System.out.println( subindice + " no es subindice valido" ); 
        
        String aBuscar = "Estudiar";
        ArrayList<String> tareasEncontradas = listaTareas.buscaTareas( aBuscar );
        System.out.println( "Tareas donde esta la palabra: " + aBuscar );        
        for( String tarea : tareasEncontradas )
            System.out.println( tarea );                
        aBuscar = "estudiar";
        tareasEncontradas = listaTareas.buscaTareas( aBuscar );
        System.out.println( "Tareas donde esta la palabra: " + aBuscar );        
        listaTareas.buscaTareas( aBuscar );

        listaTareas.guardaTareas();
        System.out.println( "Lista de tareas guardadas:" );
        listaTareas.listaTareas();

        listaTareas.eliminaTarea( 3 );
        listaTareas.eliminaTarea( -1 );        
        listaTareas.eliminaTarea( listaTareas.cantiTareas() -1 ); 
        listaTareas.eliminaTarea( listaTareas.cantiTareas() ); 
        listaTareas.listaTareas();
    }
}
