package programas;
import java.util.Scanner;
public class programa06 {
    public static void main(String[] args) {
        //declarar variable
        String nombrev;
        double sueldom,venta1,venta2,venta3,comision,sueldon;
        //creando el objeto lectura
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Nombre del vendedor:");
        nombrev=lectura.next();
        System.out.print("Sueldo mensual:");
        sueldom=lectura.nextDouble();
        System.out.print("Venta 1:");
        venta1=lectura.nextDouble();
        System.out.print("Venta 2:");
        venta2=lectura.nextDouble();
        System.out.print("Venta 3:");
        venta3=lectura.nextDouble();
        //proceso de datos
        comision=(venta1+venta2+venta3)*0.10;
        sueldon=sueldom+comision;
        //salida de datos
        System.out.println("Comisión= "+comision);
        System.out.println("Sueldo neto= "+sueldon);
    }
}
