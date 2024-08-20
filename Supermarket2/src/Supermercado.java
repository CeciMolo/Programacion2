import java.util.ArrayList;

public class Supermercado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Perez", 54321, 50000);
        Cliente cliente1 = new Cliente("María", "Lopez", 87654, true);
        Caja caja1 = new Caja(empleado1, 2);
        Producto producto1 = new Producto("naranjas", 40.50, 10);
        Producto producto2= new Producto ("manzanas", 50.40, 20);
        Producto producto3= new Producto ("bananas", 100, 50);

        ArrayList<Producto>productoCompra= new ArrayList<>();
        productoCompra.add(producto1);
        productoCompra.add(producto2);
        productoCompra.add(producto3);
        double sumaCompra=producto1.getPrecio()+ producto2.getPrecio()+ producto3.getPrecio();
        Transaccion transaccion1 = new Transaccion(cliente1, productoCompra, sumaCompra,
                caja1);
        System.out.print(transaccion1.toString());
    }

}


