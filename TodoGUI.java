import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 * TodoGUI
 *  GUI que utiliza clase Todolist para realizar la gestion de tareas.
 * 
 * @author  FRoM 
 * @version 2014
 */
public class TodoGUI
{
    private JFrame ventana;
    private JTextArea txtTareas;

    private Todolist listaTareas;

    public TodoGUI()
    {
        creaVentana();
        
        listaTareas = new Todolist();
    }

    /**
     * Muestra en area de texto las tareas, con subindice, almacenadas en "tareas.txt".
     */
    private void listaTareas()
    {
        txtTareas.setText(" " );
        int indice = 0;
        Iterator ior = listaTareas.getList().iterator();
        while(ior.hasNext())
        {
            String tare = (String)ior.next();
            txtTareas.append("\n "+ indice+". "+tare );
            indice++;
        }
    }

    /**
     * Almacena una tarea nueva en la coleccion 
     * y la muestra al usuario en el area de texto.
     */    
    private void agregaTarea()
    {
        String inputValue = JOptionPane.showInputDialog("Escriba su tarrea");
        listaTareas.getList().add(inputValue);
        listaTareas();
    }

    /**
     * Encuentra las tareas donde se encuentra la palabra ingresada por el usuario
     * y las muestra en el area de texto.
     */
    private void buscaTareas()
    {
        String inputValue = JOptionPane.showInputDialog("Palabra clave");
        ArrayList<String> tPalabras = listaTareas.buscaTareas( inputValue  );
        
        txtTareas.setText(" " );
        Iterator iorr = tPalabras.iterator();
        if(tPalabras.size()==0){
        txtTareas.append("No existen tareas con la palabra "+ inputValue );
        }
        while(iorr.hasNext())
        {
            String tare = (String)iorr.next();
            txtTareas.append("\n "+ tare );
        }
    }

    /**
     * Almacena la coleccion de tareas actuales en el archivo "tareas.txt"
     */
    private void salir()
    {
        listaTareas.guardaTareas();
        ventana.setVisible( false ); 
        
    }

    private void creaVentana()        
    {
        ventana = new JFrame( "To Do List - FRoM, 2015" );
        ventana.setBounds( 200, 200, 500, 400 );
        JPanel jpPrincipal = ( JPanel ) ventana.getContentPane();        
        jpPrincipal.setLayout( new BorderLayout() );

        txtTareas = new JTextArea( "Area de texto" );

        JButton jbListar = new JButton( "Listar" );
        JButton jbTarea = new JButton( "Tarea" );
        JButton jbBuscar = new JButton( "Buscar" );
        JButton jbSalir = new JButton( "Salir" );
        jbListar.addActionListener( new ActionListener()
            {
                public void actionPerformed( ActionEvent e )
                {   
                    listaTareas();
                }
            });
        jbTarea.addActionListener( new ActionListener()
            {
                public void actionPerformed( ActionEvent e )
                {   
                    agregaTarea();
                }
            });
        jbBuscar.addActionListener( new ActionListener()
            {
                public void actionPerformed( ActionEvent e )
                {   
                    buscaTareas();
                }
            });
        jbSalir.addActionListener( new ActionListener()
            {
                public void actionPerformed( ActionEvent e )
                {   
                    salir();
                }
            });

        JPanel jpBotones = new JPanel();
        jpBotones.add( jbListar );
        jpBotones.add( jbTarea );
        jpBotones.add( jbBuscar );        
        jpBotones.add( jbSalir );
        jpPrincipal.add( jpBotones, BorderLayout.NORTH );
        jpPrincipal.add( txtTareas, BorderLayout.CENTER );

        ventana.setVisible( true );        
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );         
    }

    public static void main( String[] args )
    {
        new TodoGUI();            
    }
}
