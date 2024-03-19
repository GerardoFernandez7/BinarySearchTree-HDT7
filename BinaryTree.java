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
     * 
     * @param node  El nodo actual en el que se está considerando la inserción.
     * @param value La asociación (clave-valor) a insertar en el árbol.
     * @return El nodo resultante después de la inserción.
     */
    public Node insert(Node node, Association<String, String> value) {
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
     * 
     * @param value La asociación (clave-valor) a insertar en el árbol.
     */
    public void insert(Association<String, String> value) {
        root = insert(root, value);
    }

    /**
     * Método público para buscar una asociación en el árbol a partir de una clave.
     * 
     * @param key La clave de la asociación a buscar.
     * @return La asociación correspondiente a la clave, o null si no se encuentra.
     */
    public Association<String, String> search(String key) {
        return search(root, key);
    }

    /**
     * Método privado para buscar una asociación en un nodo y sus descendientes a partir de una clave.
     * 
     * @param node El nodo actual en el que se está realizando la búsqueda.
     * @param key  La clave de la asociación a buscar.
     * @return La asociación correspondiente a la clave, o null si no se encuentra.
     */
    private Association<String, String> search(Node node, String key) {
        if (node == null) return null;
            // Buscar en el subárbol izquierdo primero
            Association<String, String> leftResult = search(node.left, key);
            if (leftResult != null) {
                return leftResult;
            }
            if (key.compareTo(node.value.getKey()) == 0) {
                return node.value;
            }
            // Busca en el subárbol derecho
            return search(node.right, key);
        }
    }