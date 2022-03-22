
package ejercicios;

import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int autos_vendidos=0;
         double sueldo_total=0, total_venta=0;
         String nombre;
         System.out.println("Ingrese el nombre del vendedor: ");
         nombre = leer.next();
         System.out.println("Ingrese la cantidad de autos vendidos:");
         autos_vendidos= leer.nextInt();
         System.out.println("Ingrese el monto total de la venta del mes:");
         total_venta=leer.nextDouble();
         
         double valor_sueldo=calcular_sueldo(sueldo_total,total_venta,autos_vendidos);
         
         System.out.println("El nombre del vendedor "+ nombre +"vendio un total de"+ autos_vendidos 
         +  ", y el sueldo total es de: " +valor_sueldo);
       
    }
        public static double calcular_sueldo(double sueldo_total, double total_venta, int autos_vendidos){
        double sueldo=0;
        sueldo=  80000 + 17000*autos_vendidos + 0.05*total_venta;
        return sueldo;
    }
    
}
