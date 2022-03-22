
package ejercicios;


import java.util.Scanner;


public class ejercicio2 {
 /*2-. Hacer un programa que calcule el valor del DAI (Derecho Arancelario a la Importación) para un vehículo del año 2010
utilizando la siguiente fórmula:
DAI = (Valor Vehículo en USA – Depreciación - Flete – Seguro) * 0.25
Depreciación = Valor Vehículo en USA * 0.10 
El programa deberá permitir ingresar vía teclado los valores para el valor del vehículo en USA, flete y seguro. Por el momento
el porcentaje de la depreciación será constante. Para efectos de prueba puede utilizar los siguientes valores: 
Valor USA = 5000, Depreciación = 10%, Flete = 700, Seguro = 100.
Imprimir los valores capturados así como el monto del DAI. */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double valorVehiculo, valorFlete,valorSeguro, Depreciacion;
        System.out.println("Valor del Vehiculo:");
        valorVehiculo = leer.nextDouble();//captura los datos en el tipo que se nesecita
        System.out.println("Valor del felte:");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del seguro:");
        valorSeguro = leer.nextDouble();
        System.out.println("Depreciacion:");
        Depreciacion= leer.nextDouble();
        
         double valorDai = ejercicio2.calcular_dai(valorVehiculo, valorFlete, valorSeguro,Depreciacion);
         double valordepreciacion= ejercicio2.calcular_depreciacion(valorVehiculo);
        
        System.out.println("Valor del DAI: " + valorDai);
        System.out.println("Valor del Flete: " + valorFlete);
        System.out.println("Valor del Seguro: " + valorSeguro);
        System.out.println("Depreciacion: " + valordepreciacion);
        
        
    }
    public static double calcular_dai(double valorVehiculo, double valorFlete,double valorSeguro, double Depreciación){
        double dai=0;
        dai = (valorVehiculo - Depreciación - valorFlete - valorSeguro) * 0.25;
        return dai;
    }
   public static double calcular_depreciacion(double valorVehiculo){
       double depreciacion =0;
        double Depreciación = valorVehiculo * 0.10;
       return depreciacion;
   }
    
}
