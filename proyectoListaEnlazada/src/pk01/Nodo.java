package pk01;

public class Nodo {

    private Object dato;
    private Nodo siguiente;

    public Nodo(Object dato) {
        this.dato = dato;
        siguiente = null;
    }

    public Nodo(Object dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }


    public int obtenerEdad() {
        return ((Empleado) dato).getEdad();
    }

}
