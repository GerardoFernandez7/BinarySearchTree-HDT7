/**
 * Clase que representa un árbol binario.
 */
public class BinaryTree {

    /**
     * Nodo raíz del árbol.
     */
    Node root;

    /**
     * Método privado para insertar un nodo en el árbol.
     * @param node El nodo actual en el que se está considerando la inserción.
     * @param value La asociación (clave-valor) a insertar en el árbol.
     * @return El nodo resultante después de la inserción.
     */
     private Node insert(Node node, Association<String, String> value) {
        // Si el árbol está vacío, crea un nuevo nodo y devuelve
        if (node == null) {
            return new Node(value);
        }

        // Compara la llave del nuevo nodo con la llave del nodo actual
        int comparacion = value.getKey().compareTo(node.value.getKey());

        // Si la llave del nuevo nodo es menor, inserta en el subárbol izquierdo
        if (comparacion < 0) {
            node.left = insert(node.left, value);
        }
        // Si la llave del nuevo nodo es mayor, inserta en el subárbol derecho
        else if (comparacion > 0) {
            node.right = insert(node.right, value);
        }
        
        return node;
    }

    /**
     * Método público para insertar un nuevo nodo en el árbol.
     * @param value La asociación (clave-valor) a insertar en el árbol.
     */
    public void insert(Association<String, String> value) {
        root = insert(root, value);
    }

    /**
     * Método privado para realizar un recorrido en orden del árbol (in-order traversal).
     * @param node El nodo actual que se está considerando durante el recorrido.
     */
    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.value.getKey() + ": " + node.value.getValue());
            inOrderTraversal(node.right);
        }
    }

    /**
     * Método público para realizar un recorrido en orden del árbol.
     */
    public void inOrderTraversal() {
        inOrderTraversal(root);
    } 
}