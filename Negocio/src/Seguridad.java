public class Seguridad extends Empleado {
    private String sector;

    public Seguridad(String nombre, String apellido, int dni, double sueldo, int cantHoras, String sector) {
        super(nombre, apellido, dni, sueldo, cantHoras);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
