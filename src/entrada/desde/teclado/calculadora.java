
package entrada.desde.teclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class calculadora {
    public static void main(String[] args) {
        double cantidad1=0,cantidad2=0;
        //Crear el objeto leer de las clases correspondientes para obtener los datos
        BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
        try{//Se utiliza el manejador de errores de lo contrario genera error
         System.out.println("Ingresar cantidad 1: ");
         //Hace la lectura desde el teclado y lo convierte a double
         cantidad1 = Double.parseDouble(leer.readLine());
         System.out.println("Ingresar cantidad 2: ");
         cantidad2 = Double.parseDouble(leer.readLine());
         //Llamar los metodos desde la clase y enviar los parametros
          System.out.println("El resultado de la suma es           :" + calculadora.sumar(cantidad1,cantidad2));
          System.out.println("El resultado de la resta es          :" + calculadora.restar(cantidad1,cantidad2));
          System.out.println("El resultado de la multiplicacion es :" + calculadora.multiplicar(cantidad1,cantidad2));
          System.out.println("El resultado de la division es       :" + calculadora.dividir(cantidad1,cantidad2));
          
        }catch (Exception e){//captura del error
            System.out.println(e.getMessage());
        }
        System.out.println(cantidad1 + " " + cantidad2);
    }
    
    public static double sumar(double cantidad1, double cantidad2){
        double suma = cantidad1 + cantidad2;
        return suma;
    }
     public static double restar(double cantidad1, double cantidad2){
        double resta = cantidad1 - cantidad2;
        return resta;
    }
      public static double multiplicar(double cantidad1, double cantidad2){
        double multiplicacion = cantidad1 * cantidad2;
        return multiplicacion;
    }
       public static double dividir(double cantidad1, double cantidad2){
        double division = cantidad1 / cantidad2;
        return division;
    }
}
