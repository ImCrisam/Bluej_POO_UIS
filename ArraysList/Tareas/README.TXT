EJERCICIO ToDoList - FRoM 2015

El propósito de este ejercicio es implementar los métodos de la clase tal como se
indica en el código. Debe leer la documentación que está antes del método para saber
las características que se piden. También debe aportar control dentro de los métodos 
para proteger la aplicación de usos inadecuados; como subindices fuera de rango 
o cadenas de caracteres vacias.

iniciaTareas() [ 5 puntos ]
guardaTareas() [ 5 puntos ]
buscaTarea( int subIndice ) [ 5 puntos ]
buscaTarea( String palabra ) [ 5 puntos ]
eliminaTarea( int nTarea ) [ 5 puntos ]

Ejercicio extra: [ 20 puntos ]
Implemente el código necesario para que la clase tareasGui maneje la funcionalidad
de la clase Todolist usando los botones así:
Al iniciar la aplicación lee las tareas que se encuentran en el archivo "tareas.txt"
Botón Listar: presenta las tareas con su subíndice en el área de texto.
Botón Tarea: agrega una nueva tarea a la colección, informándo en el área de texto.
Botón Buscar: busca una palabra en la colección y muestra en el área de texto
 todas las tareas donce la encuentra.
Botón Salir: cierra la ventana guardando todas las tareas actuales de la colección 
en el archivo "tareas.txt".