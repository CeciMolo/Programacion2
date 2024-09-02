import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        Cliente c1= new Cliente("Maria", "Lopez", 12345, 1, true);
        Cliente c2= new Cliente("Luisina", "Perez", 45678, 2, true);
        Cliente c3= new Cliente ("Mariela", "Aguirre", 87654, 3, false);
        Cajero caja1= new Cajero("Mario", "García", 65432, 38, 40, 1);
        Cajero caja2= new Cajero("Mauro", "Gauna", 87654, 40, 40, 2);
        Cajero caja3= new Cajero ("Griselda", "Blanco", 98765, 40, 35, 3);
        Supervisor supervisor1= new Supervisor("Cecilia", "Molo", 32456, "congelado", Arrays.asList(caja1, caja2));
        Supervisor supervisor2= new Supervisor("Marisel", "Soria", 98765, "Carniceria",Arrays.asList(caja3,caja2));
        Supervisor supervisor3= new Supervisor("Luis", "Diaz", 98765, "Panaderia",Arrays.asList(caja3,caja1));
        Supervisor supervisor4= new Supervisor("Mauro", "Garcia", 435678,"todos",Arrays.asList(caja1, caja2, caja3));
        Sucursal sucursal1= new Sucursal(Arrays.asList(caja1,caja2,caja3), Arrays.asList(supervisor1,supervisor2,supervisor3), supervisor4);
        System.out.println("La sucursal 1 cuenta con el siguiente personal: " + sucursal1.toString());

    }
}