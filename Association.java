/**
 * Clase que representa una asociación entre una clave (key) y un valor (value).
 * @param <K> El tipo de la clave.
 * @param <V> El tipo del valor.
 */
public class Association<K, V> {

    /**
     * La clave de la asociación.
     */
    private K key;

    /**
     * El valor de la asociación.
     */
    private V value;

    /**
     * Constructor que crea una nueva asociación con la clave y el valor especificados.
     * @param key La clave de la asociación.
     * @param value El valor de la asociación.
     */
    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Obtiene la clave de la asociación.
     * @return La clave de la asociación.
     */
    public K getKey() {
        return key;
    }

    /**
     * Obtiene el valor de la asociación.
     * @return El valor de la asociación.
     */
    public V getValue() {
        return value;
    }

    /**
     * Establece la clave de la asociación.
     * @param key La clave a establecer.
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * Establece el valor de la asociación.
     * @param value El valor a establecer.
     */
    public void setValue(V value) {
        this.value = value;
    }
}