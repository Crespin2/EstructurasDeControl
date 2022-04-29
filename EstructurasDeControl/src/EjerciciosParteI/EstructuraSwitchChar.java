
package EjerciciosParteI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchChar {
    public static void main(String[] args) {
        try{ //Objeto de leer de la clase BufferedReader
            BufferedReader leer= new   BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingrese el estado civil de la persona");
            String estadoCivil = leer.readLine(); //Datos tipo String
            //toUpperCase combierte el contenido a mayuscula y cahrAt extrae el caracter de la poscion 0
            switchChar(estadoCivil.toUpperCase().charAt(0));
            
         
        }catch(Exception e){
            System.out.println(e.getMessage()); 
        }
 
    }
    
    public static void switchChar(char estadoCivil){ //Metodo para el switch
        String mensajeEstadoCivil;
        switch(estadoCivil){ //valor o caracter a evaluar
            case 'S'://En el caso que el valor sea "S"
               mensajeEstadoCivil="Soltero/a";
             break;//Detiene el proceso si era el valor ingresado
            case 'C'://En el caso que el valor sea "S"
               mensajeEstadoCivil="Casado/a";
             break;  
            case 'D':
             mensajeEstadoCivil="Divorciado/a";
             break;
            case 'A':
              mensajeEstadoCivil="Acompañado/a";
             break;
            case 'F':
             mensajeEstadoCivil="Forever Alone";
             break;
            default://Si no se cumple ninguno de los anteriores
             mensajeEstadoCivil="Estado civil erroneo!";
        }   
        System.out.println("Su estado civil es:"+ mensajeEstadoCivil);
    }
}
