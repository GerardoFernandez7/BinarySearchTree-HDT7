/**
 * Clase que representa un nodo en un árbol binario.
 */
public class Node {

    /**
     * La asociación de clave-valor almacenada en este nodo.
     */
    Association<String, String> value;

    /**
     * El hijo izquierdo del nodo.
     */
    Node left;

    /**
     * El hijo derecho del nodo.
     */
    Node right;

    /**
     * Constructor que crea un nuevo nodo con la asociación de clave-valor especificada.
     * @param value La asociación de clave-valor a almacenar en este nodo.
     */
    Node(Association<String, String> value) {
        this.value = value;
        right = null;
        left = null;
    }
}