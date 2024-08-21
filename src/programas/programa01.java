package programas;
import java.util.Scanner;
public class programa01 {
    public static void main(String[] args) {
        //declarar variables
        String cliente,producto;
        double cantidad,precio,subtotal,IGV,totalpagar;
        //creando el objeto lectura
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Nombre del cliente:");
        cliente=lectura.next();
        System.out.print("Nombre del producto:");
        producto=lectura.next();
        System.out.print("Cantidad:");
        cantidad=lectura.nextDouble();
        System.out.print("Precio:");
        precio=lectura.nextDouble();
        //proceso de datos
        subtotal=precio*cantidad;
        IGV=subtotal*0.18;
        totalpagar=subtotal-IGV;
        //salida de datos
        System.out.println("Subtotal= "+subtotal);
        System.out.println("IGV= "+IGV);
        System.out.println("Total a pagar = "+totalpagar);
    }
}
