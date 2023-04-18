import java.time.LocalTime;

class Empleado {
    private String nombre;
    private double salario;
    private LocalTime horaIngreso;

    public Empleado(String nombre, double salario, LocalTime horaIngreso) {
        this.nombre = nombre;
        this.salario = salario;
        this.horaIngreso = horaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", horaIngreso=" + horaIngreso +
                '}';
    }
}