package PK01;

 public class principal {

    public static void main(String args[]) {

        circulo Circulo = new circulo(0, 0, 0);
        Circulo.setRadio(IO.leerEntero("Digite el valor del radio del circulo"));
        Circulo.calcularPerimetro();
        Circulo.calcularArea();
        

      IO.escribir("Area: "+Circulo.getArea()+"Perimetro: "+Circulo.getPerimetro());
      


    }

}