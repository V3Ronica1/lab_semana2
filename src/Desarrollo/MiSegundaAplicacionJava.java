
package Desarrollo;

public class MiSegundaAplicacionJava {
    
    
    public static void main(String[] args) {
        //Se hace el llamado de cada uno de los metodos creados
        
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
        
      }
    
    public static void metodoConVoid(){
        System.out.println("Contenido del metodo con void");
}
    public static int metodoConInt(){
        System.out.println("Contenido del metodo con Int");
     return 0;
    }
    
    public static double  metodoConDouble(){
        System.out.println("Contenido del metodo con Double");
        return 0.0;
    }
    
    public static String  metodoConString(){
        System.out.println("Contenido del metodo con String");
        return "";
    }
    
    
}
