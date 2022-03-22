
package ejercicios;

import java.util.Scanner;



public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int computadoras_vendidas=0;
        double sueldo_base=0,renta=0,sueldo_total=0,total_venta=0;
        String nombre;
        System.out.println("Ingrese el nombre del vendedor:");
        nombre=leer.next();
        System.out.println("Ingrese la cantidad de computadoras vendidas:");
        computadoras_vendidas=leer.nextInt();
        
        double valor_sueldo=calcular_sueldo(sueldo_total, total_venta, computadoras_vendidas);
        double valor_renta= obtener_renta(sueldo_base);
        
        System.out.println("El nombre del vendedor es: " + nombre);
        System.out.println("El sueldo total es: " + valor_sueldo);
        System.out.println("La retencion de la renta es: " + valor_renta);
       
}
    
    public static double calcular_sueldo(double sueldo_total, double total_venta, int computadoras_vendidas){
        double  sueldo=0;
        sueldo= 300000+5000*computadoras_vendidas*total_venta;
        return sueldo;
        
    }
    public static double obtener_renta(double sueldo_base){
        double renta=0;
        renta=0.10*sueldo_base;
        return renta;
    }
    
 }
