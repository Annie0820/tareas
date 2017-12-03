
public class AVLNode<T> {
    public Comparable<T> dato;      	 // el dato del nodo
    public AVLNode<T> izquierdo;            // hijo izquierdo
    public AVLNode<T> derecho;              // hijo derecho
    public int height;                   // altura

    // Constructors
    public AVLNode( Comparable<T> dato ){
        this( dato, null, null );
    }

    public AVLNode( Comparable<T> dato, AVLNode<T> izq, AVLNode<T> der ){
        this.dato = dato;
        this.izquierdo = izq;
        this.derecho = der;
        height   = 0;               // altura predeterminada
    }
}
