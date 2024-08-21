package programas;
import java.util.Scanner;
public class programa07 {
    public static void main(String[]args) {
    //declarar variables
    String nombre,apellido,genero;
    double pagod,diasts,semanast,gastom,ahorrom;
    //creando el objeto lectura
    Scanner lectura=new Scanner(System.in);
    //entrada de datos
    System.out.print("Nombre del empleado:");
    nombre=lectura.next();
    System.out.print("Apellido del empleado:");
    apellido=lectura.next();
    System.out.print("Género del empleado:");
    genero=lectura.next();
    System.out.print("Pago diario:");
    pagod=lectura.nextDouble();
    System.out.print("Días de trabajo a la semana:");
    diasts=lectura.nextDouble();
    System.out.print("Semanas de trabajo al mes:");
    semanast=lectura.nextDouble();
    System.out.print("Gasto mensual:");
    gastom=lectura.nextDouble();
    //proceso de datos
    ahorrom=(pagod*diasts*semanast)-gastom;
    //salida de datos
    System.out.println("Su ahorro mensual es: "+ahorrom);
    }
}
    