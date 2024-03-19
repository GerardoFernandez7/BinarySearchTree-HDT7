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

    /**
     * Obtiene la asociación de clave-valor almacenada en este nodo.
     * @return La asociación de clave-valor almacenada en este nodo.
     */
    public Association<String,String> getValue() {
        return this.value;
    }

    /**
     * Establece la asociación de clave-valor almacenada en este nodo.
     * @param value La asociación de clave-valor a establecer en este nodo.
     */
    public void setValue(Association<String,String> value) {
        this.value = value;
    }

    /**
     * Obtiene el hijo izquierdo de este nodo.
     * @return El hijo izquierdo de este nodo.
     */
    public Node getLeft() {
        return this.left;
    }

    /**
     * Establece el hijo izquierdo de este nodo.
     * @param left El nodo que se establecerá como hijo izquierdo de este nodo.
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * Obtiene el hijo derecho de este nodo.
     * @return El hijo derecho de este nodo.
     */
    public Node getRight() {
        return this.right;
    }

    /**
     * Establece el hijo derecho de este nodo.
     * @param right El nodo que se establecerá como hijo derecho de este nodo.
     */
    public void setRight(Node right) {
        this.right = right;
    }
}