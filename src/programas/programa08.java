package programas;
import java.util.Scanner;
public class programa08 {
    public static void main(String[]args) {
    //declarar variables
    String nya,pais,provincia,distrito,producto;
    double cantidad,precio,descuento,preciof;
    //creando el objeto lectura
    Scanner lectura=new Scanner(System.in);
    //entrada de datos
    System.out.print("Nombre y Apellido:");
    nya=lectura.next();
    System.out.print("País:");
    pais=lectura.next();
    System.out.print("Provincia:");
    provincia=lectura.next();
    System.out.print("Distrito:");
    distrito=lectura.next();
    System.out.print("Producto:");
    producto=lectura.next();
    System.out.print("Cantidad:");
    cantidad=lectura.nextDouble();
    System.out.print("Precio:");
    precio=lectura.nextDouble();
    //proceso de datos
    descuento=(precio*cantidad)*0.20;
    preciof=(precio*cantidad)-descuento;
    //salida de datos
    System.out.println("Descuento: "+descuento);
    System.out.println("El precio final: "+preciof);
    }
}
