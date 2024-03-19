import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que actúa como controlador para la lectura de un archivo y la manipulación de un árbol binario.
 */
public class Controlador {

    /**
     * El árbol binario utilizado para almacenar las asociaciones de palabras.
     */
    BinaryTree tree = new BinaryTree();

    /**
     * Método para leer un archivo que contiene asociaciones de palabras y cargarlas en el árbol binario.
     */
    public void leerArchivo(){
        String archivo = "diccionario.txt";

        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            while (linea != null) {
                String[] partes = linea.split(", ");
                String palabraEnIngles = partes[0].trim();
                String palabraEnEspanol = partes[1].trim();

                //Insertar la información del archivo en el arbol-binario
                tree.insert(new Association<>(palabraEnIngles, palabraEnEspanol));
                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}