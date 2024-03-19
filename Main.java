/**
 * @author Gerardo Andre Fernandez Cruz
 * @version 1.0 20/03/2024
 * @Description Este es un diccionario de Inglés a español, en el que todas las palabras
 *              se almacenan en una base de datos de arbol binario. El programa puede traducir oraciones del archivo
 *              texto.txt y si no encuentra la palabra en el arbol devuelve la palabra entre asteriscos.
 */

/**
 * Clase principal que contiene el método de inicio del programa.
 */
public class Main {

    /**
     * Método principal que sirve como punto de entrada del programa.
     * 
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.leerArchivo();
        controller.leerTexto();
    }
}