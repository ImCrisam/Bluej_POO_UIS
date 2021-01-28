EJERCICIO ARCHIVOS 1

El propósito de este ejercicio es implementar la funcionalidad de los botónes de la GUI.
La aplicación opera secuencialmente:  [4 puntos]
* Al inicio sólo está habilitado el botón LISTAR.
* Luego de ejecutar LISTAR se deshabilita y se habilita BUSCAR
* después de presionar BUSCAR se deshabilita y se habilita GUARDAR.
* después de presionar GUARDAR se deshabilita y todos los botones quedan deshabilitados.

El archivo registros.txt contiene cadenas de texto así: código apellido1 apellido2 nombre nota
Este es el registro la nota que cada estudiante dio al auxiliar de la asignatura. 

Recuerde utilizar "Salvar como.." antes de desarrollar cada punto!
LISTAR: [6 puntos]
Lee el archivo registros.txt y muestra en el área de texto; una línea por cada registro. 
Opcional: 
Puede crear una colección de String para su uso en las siguientes funcionalidades.

Recuerde utilizar "Salvar como.." antes de desarrollar cada punto!
BUSCAR: [6 puntos]
Por medio de una ventana emergente (usando el método estático showInputDialog de JOptionPane)
solicita al usuario un nombre y lo busca en el archivo o en el arreglo que creó;
el resultado de la búsqueda se muestra mediante el uso de el método estático showMessageDialog de JOptionPane.

Recuerde utilizar "Salvar como.." antes de desarrollar cada punto!
GUARDAR: 
Limpia el área de texto. [2 puntos]
Crea un objeto por cada registro y crea un archivo tipo objeto de nombre objRegs;
Guarda todos los objetos creados. [6 puntos]
Si el proceso fue exitoso escribe en el área de texto "OBJETOS GUARDADOS EXITOSAMENTE en objRegs". [2 puntos]


Estado: [4 puntos]
Se una para poner todos los mensajes generados por la aplicación:
* el botón que se va usando.
* si se lanza una excepción.


IMPORTANTE:
* Implemente todos los métodos de la clase Evaluacion.
* Recuerde que debe manejar todas las excepciones que puede causar el manejo de archivos.
* Para facilitar las funciones se recomienda crear una colección con los registros en la clase GuiEvaluacion.
* También debe incluir todos los imports que sean necesarios y crear las variables que se requieran.
* Al finalizar su trabajo, o al terminarse el tiempo de la evaluación envíe la última versión 
  que funciona sin errores a <oop.eisi@gmail.com>