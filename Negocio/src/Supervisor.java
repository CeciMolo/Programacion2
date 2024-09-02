import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Persona implements Jefe, Informes{
    private String sector;
    private List<Empleado>personasACargo;

    public Supervisor(String nombre, String apellido, int dni, String sector, List<Empleado> personasACargo) {
        super(nombre, apellido, dni);
        this.sector = sector;
        this.personasACargo = personasACargo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }





    @Override
    public double calcularSueldo() {
        double sueldo= 1000000 + (1000000* 0.10);
        return sueldo;
    }

    @Override
    public void verSueldo(Empleado emple) {

        System.out.println(emple.getSueldo());
    }

    @Override
    public void verParticularidades(Cliente cliente) {
        System.out.println("");

    }
}
