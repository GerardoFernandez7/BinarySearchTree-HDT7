import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase que contiene pruebas unitarias para la clase BinaryTree.
 */
public class UnitTests {

    private BinaryTree tree;

    /**
     * Método de configuración que se ejecuta antes de cada prueba.
     */
    @Before
    public void setUp() {
        tree = new BinaryTree();
    }

    /**
     * Prueba unitaria para insertar y buscar asociaciones en el árbol.
     */
    @Test
    public void testInsertAndSearch() {
        // Insertar algunas asociaciones en el árbol
        tree.insert(new Association<>("hello", "hola"));
        tree.insert(new Association<>("goodbye", "adiós"));
        tree.insert(new Association<>("tree", "árbol"));

        // Buscar las asociaciones insertadas
        Association<String, String> helloAssociation = tree.search("hello");
        Association<String, String> goodbyeAssociation = tree.search("goodbye");
        Association<String, String> treeAssociation = tree.search("tree");

        // Verificar que las asociaciones se encuentren correctamente
        assertEquals("hola", helloAssociation.getValue());
        assertEquals("adiós", goodbyeAssociation.getValue());
        assertEquals("árbol", treeAssociation.getValue());
    }

    /**
     * Prueba unitaria para buscar una clave que no existe en el árbol.
     */
    @Test
    public void testSearchNonExistentKey() {
        // Buscar una clave que no existe en el árbol
        Association<String, String> nonExistentAssociation = tree.search("nonexistent");

        // Verificar que la asociación para la clave no existente sea nula
        assertNull(nonExistentAssociation);
    }
}
