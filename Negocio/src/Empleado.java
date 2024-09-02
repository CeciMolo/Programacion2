public abstract class Empleado extends Persona{

    private double sueldo;
    private int cantHoras;

    public Empleado(String nombre, String apellido, int dni, double sueldo, int cantHoras) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.cantHoras = cantHoras;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

}
