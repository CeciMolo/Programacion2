import java.util.ArrayList;
import java.util.Arrays;

public class Transaccion {
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList<>();
    private double total;
    private Caja caja;

    public Transaccion(Cliente cliente, ArrayList<Producto> productos, double total, Caja caja) {
        this.cliente = cliente;
        this.productos = productos;
        this.total = total;
        this.caja = caja;
    }
    public String mostrarProducto(){
        String texto="";
        for (Producto producto : productos) {
            texto += producto.getNombre()+" , ";
        }
        return texto;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "Transaccion" +
                "\nDatos del cliente" + cliente +
                "\nproductos:" + mostrarProducto() +
                "\ntotal:" + total +
                ", " + caja;
    }
}

