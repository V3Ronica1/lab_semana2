
package entrada.desde.teclado;

import java.util.Scanner;


public class CalcularDai {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double valorMaquina, valorFlete,valorSeguro;
        System.out.println("Valor de la maquina:");
        valorMaquina = leer.nextDouble();//captura los datos en el tipo que se nesecita
        System.out.println("Valor del felte:");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del seguro:");
        valorSeguro = leer.nextDouble();
        
        double valorDai = CalcularDai.obtenerDai(valorMaquina, valorFlete, valorSeguro);
        double valorConIva = CalcularDai.obtenerIva(valorDai);
        
        System.out.println("Valor del DAI: " + valorDai);
        System.out.println("Valor del IVA: " + valorConIva);
    }
    //crear el metodo para el calculo del dai
    public static double obtenerDai(double valorMaquina, double valorFlete, double valorSeguro){
    double dai = 0;
    dai = (valorMaquina - valorFlete - valorSeguro) * 0.10;
    return dai;
}
    //Metodo para obtener el valor mas IVA
    public static double obtenerIva(double dai){
        double pagoConIva = 0;
        pagoConIva = dai * 1.13;
        return pagoConIva;
    }

 }
