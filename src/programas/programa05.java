package programas;
import java.util.Scanner;
public class programa05 {
    public static void main(String[] args) {
        //declarar variable
        String empleado;
        double horast,tarifah,sueldob,descuento,sueldon;
        //creando el objeto lectura
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Nombre del empleado:");
        empleado=lectura.next();
        System.out.print("Horas trabajadas:");
        horast=lectura.nextDouble();
        System.out.print("Tarifa por hora:");
        tarifah=lectura.nextDouble();
        //proceso de datos
        sueldob=horast*tarifah;
        descuento=sueldob*0.13;
        sueldon=sueldob-descuento;
        //salida de datos
        System.out.println("Sueldo bruto= "+sueldob);
        System.out.println("Descuento= "+descuento);
        System.out.println("Sueldo neto= "+sueldon);
    }
}
        
