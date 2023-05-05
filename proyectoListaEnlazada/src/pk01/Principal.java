package pk01;

public class Principal {

    public static void main(String args[]) {
        Lista lista = new Lista();

        IO.escribir(
                "\nInsertar:\n");

        // Añadir 3 empleados mediante un ciclo for
        for (int i = 0; i < 3; i++) {
            Empleado emp = new Empleado();
            emp.setNombre(IO.leerPalabra("Digite nombre de empleado " + (i + 1)));
            emp.setCodigo(IO.leerEntero("Digite tu código"));
            emp.setEdad(IO.leerEntero("Digite tu edad"));
            lista.insertarCabezaLista(emp);
        }

        

        IO.escribir(
                "\nVisualizar:\n");

        // Imprimir datos de la lista
        IO.escribir(lista.visualizar());

        lista.eliminar(1000);

        lista.modificarEdades();

        // Imprimir datos de la lista
        IO.escribir(lista.visualizar());

    }

}
