package programas;
import java.util.Scanner;
public class programa02 {   
    public static void main(String[] args) {
        //declarar variables
        double s1,s2,s3,s4,s5,totals,promedios;
        //creando el objeto lectura
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Sueldo de empleado 1:");
        s1=lectura.nextDouble();
        System.out.print("Sueldo de empleado 2:");
        s2=lectura.nextDouble();
        System.out.print("Sueldo de empleado 3:");
        s3=lectura.nextDouble();
        System.out.print("Sueldo de empleado 4:");
        s4=lectura.nextDouble();
        System.out.print("Sueldo de empleado 5:");
        s5=lectura.nextDouble();
        //proceso de datos
        totals=s1+s2+s3+s4+s5;
        promedios=totals/5;
        //salida de datos
        System.out.println("Total de sueldos= "+totals);
        System.out.println("Promedio de sueldos= "+promedios);
        }
}
