package programas;
import java.util.Scanner;
public class programa04 {
    public static void main(String[] args) {
        //declarar variable
        String empleado,cargo;
        double ingreso,gastom,ahorrom,ahorroa;
        //creando el objeto lectura
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Nombre del empleado:");
        empleado=lectura.next();
        System.out.print("Cargo del empleado:");
        cargo=lectura.next();
        System.out.print("Ingreso mensual:");
        ingreso=lectura.nextDouble();
        System.out.print("Gasto mensual:");
        gastom=lectura.nextDouble();
        //proceso de datos
        ahorrom=ingreso-gastom;
        ahorroa=ahorrom*12;
        //salida de datos
        System.out.println("Ahorro mensual= "+ahorrom);
        System.out.println("Ahorro anual= "+ahorroa);
    }
}    