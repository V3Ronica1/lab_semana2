
package ejercicios;

import java.util.Scanner;
/* Escriba un programa para calcular el salario bruto de un empleado. 
Para calcular el salario del empleado debemos de hacer los descuentos por llegadas tardías 
así como la  retención de la renta que es el 10% del salario menos el descuento por llegada tardía.
Debe de crear una  fórmula  para  determinar  el  salario  por  minuto  y  calcular  el  monto  por  
las  llegadas tardías y descontarlo al salario, luego debe de descontar el monto de la renta. 
El programa deberá permitir ingresar el nombre del empleado, el salario mensual. El programa deberá de imprimir 
el nombre del empleado, el descuento por llegadas tardías, la retención de la renta y finalmente el salario bruto. */

public class ejercicio5 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       double salario_bruto=0,desc_llegadastardias=0,renta=0,salario_minuto=0,salario_mensual=0;
       String nombre;
        System.out.println("Ingrese el nombre del empleado");
        nombre=leer.next();
        System.out.println("El salario mensual del empleado es:");
        salario_mensual=leer.nextDouble();
        
        
        
        
    }
    
}