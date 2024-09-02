public class Cajero extends Empleado implements Informes {
    private int nroCaja;

    public Cajero(String nombre, String apellido, int dni, double sueldo, int cantHoras, int nroCaja) {
        super(nombre, apellido, dni, sueldo, cantHoras);
        this.nroCaja = nroCaja;
    }

    public int getNroCaja() {
        return nroCaja;
    }

    public void setNroCaja(int nroCaja) {
        this.nroCaja = nroCaja;
    }




    @Override
    public void verSueldo(Empleado emple) {

        System.out.println("");
    }

    @Override
    public void verParticularidades(Cliente cliente) {
        System.out.println(cliente.toString());

    }
}
