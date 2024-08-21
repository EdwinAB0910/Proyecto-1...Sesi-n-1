package programas;
import java.util.Scanner;
public class programa03 {   
    public static void main(String[] args) {
        //declarar variables
        String empleado,cargo;
        double ingreso,gastom,ahorrom,ahorrob,ahorros,ahorroa;
        //creando el objeto lectura
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Nombre del empleado:");
        empleado=lectura.next();
        System.out.print("Cargo que ocupa:");
        cargo=lectura.next();
        System.out.print("Ingreso:");
        ingreso=lectura.nextDouble();
        System.out.print("Gasto mensual:");
        gastom=lectura.nextDouble();
        //proceso de datos
        ahorrom=ingreso-gastom;
        ahorrob=ahorrom*2;
        ahorros=ahorrob*3;
        ahorroa=ahorros*2;
        //salida de datos
        System.out.println("Ahorro mensual= "+ahorrom);
        System.out.println("Ahorro bimestral= "+ahorrob);
        System.out.println("Ahorro semestral= "+ahorros);
        System.out.println("Ahorro anual= "+ahorroa);
        }
}
