package pk01;

public class Lista {

    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    /**
     * Insertar al principio de la lista
     *
     * @param dato
     */
    public void insertarCabezaLista(Object dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
    }

    public Object obtenerCodigo(Nodo n) {
        return ((Empleado) n.getDato()).getCodigo();
    }

    public Object obtenerNombre(Nodo n) {
        return ((Empleado) n.getDato()).getNombre();
    }

   

    /**
     * Eliminar elemento de la lista
     *
     * @param dato
     */
    public void eliminar(Object dato) {
        Nodo actual = cabeza, anterior = null;

        while ((actual != null) && !obtenerCodigo(actual).equals(dato)) {
            if (!obtenerCodigo(actual).equals(dato)) {
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }

        if (actual != null) {
            // Se distingue entre que el nodo sea el cabecera
            // o del resto de la lista
            if (actual == cabeza) {
                cabeza = actual.getSiguiente();
            } else {
                anterior.setSiguiente(actual.getSiguiente());
            }

            actual = null;
        }
    }

    /**
     * Visualizar contenido de la lista
     */
    public String visualizar() {
        Nodo n = cabeza;
        String cadena = "";
        while (n != null) {
            cadena = obtenerCodigo(n) + ": " + obtenerNombre(n) + ", " + ((Empleado) n.getDato()).getEdad() + " años, "
                    + cadena;
            n = n.getSiguiente();
        }
        return cadena;
    }

    public void modificarEdades() {
        Nodo n = cabeza;
        while (n != null) {
            int edad = n.obtenerEdad();
            if (edad < 0) {
                edad *= -1;
                ((Empleado) n.getDato()).setEdad(edad);
                IO.escribir("La edad del empleado " + ((Empleado) n.getDato()).getNombre() + " ha sido corregida a "
                        + edad);
            } else if (edad > 100) {
                ((Empleado) n.getDato()).setEdad(100);
                IO.escribir(
                        "La edad del empleado " + ((Empleado) n.getDato()).getNombre() + " ha sido corregida a 100");
            }
            n = n.getSiguiente();
        }
    }

    public Nodo leerPrimero() {
        return cabeza;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

}
