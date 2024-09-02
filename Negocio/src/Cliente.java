public class Cliente extends Persona{
    private int nroSocio;
    private boolean esMayorista;

    public Cliente(String nombre, String apellido, int dni, int nroSocio, boolean esMayorista) {
        super(nombre, apellido, dni);
        this.nroSocio = nroSocio;
        this.esMayorista = esMayorista;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public boolean isEsMayorista() {
        return esMayorista;
    }

    public void setEsMayorista(boolean esMayorista) {
        this.esMayorista = esMayorista;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nroSocio=" + nroSocio +
                ", esMayorista=" + esMayorista +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                '}';
    }
}
