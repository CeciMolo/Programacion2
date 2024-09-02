import java.util.List;

public class Sucursal {
    private List<Cajero> cajeros;
    private List<Supervisor>supervisores;
    private Supervisor supervisorGerente;

    public Sucursal(List<Cajero> cajeros, List<Supervisor> supervisores, Supervisor supervisorGerente) {
        this.cajeros = cajeros;
        this.supervisores = supervisores;
        this.supervisorGerente = supervisorGerente;
    }
    public String mostrarCajeros(){
        String texto= " ";
        for (Cajero cajero: cajeros){
            texto+= cajero.getNombre() + "," + cajero.getApellido()+ " ; ";
        }
        return texto;
    }
    public String mostrarSupervisores(){
        String texto2= " ";
        for (Supervisor supervisor:supervisores){
            texto2+= supervisor.getNombre() + " , " + supervisor.getApellido() + " ; ";
        }
        return texto2;
    }


    public List<Cajero> getCajeros() {
        return cajeros;
    }

    public void setCajeros(List<Cajero> cajeros) {
        this.cajeros = cajeros;
    }

    public List<Supervisor> getSupervisores() {
        return supervisores;
    }

    public void setSupervisores(List<Supervisor> supervisores) {
        this.supervisores = supervisores;
    }

    public Supervisor getSupervisorGerente() {
        return supervisorGerente;
    }

    public void setSupervisorGerente(Supervisor supervisorGerente) {
        this.supervisorGerente = supervisorGerente;
}


    @Override
    public String toString() {
        return " " +
                "\ncajeros:" + mostrarCajeros()+ "\nLos "+
                 "supervisores:" + mostrarSupervisores() +
                " \nSupervisor Gerente: " + supervisorGerente.getNombre() + " , " + supervisorGerente.getApellido()
                ;
    }
}
