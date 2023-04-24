import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // Prints "Hello, World" to the terminal window.
    Circulo circulo1 = new Circulo(2, 3, 5);
    circulo1.imprimir();

    //recta
    Punto punto1 = new Punto(1, 2);
    Punto punto2 = new Punto(3, 4);
    Recta recta1 = new Recta(punto1, punto2);
    System.out.println("La pendiente de la recta es: " + recta1.getPendiente());
    System.out.println("La longitud de la recta es: " + recta1.getLongitud());

    //poligono

    Punto punto3 = new Punto(4, 2);
    Punto punto4 = new Punto(6, 6);
    Punto punto5 = new Punto(3, 9);

    ArrayList<Punto> puntos = new ArrayList<>();
    puntos.add(punto3);
    puntos.add(punto4);
    puntos.add(punto5);

    Poligono poligono1 = new Poligono("Poligono", puntos);
    System.out.println("El área del " + poligono1.nombre + " es " + poligono1.calcularArea());

    Punto punto6 = new Punto(1, 0);
    poligono1.agregarPunto(punto6);
    System.out.println("El área del " + poligono1.nombre + " es " + poligono1.calcularArea());

    poligono1.calcularPendientes();

  }

}
