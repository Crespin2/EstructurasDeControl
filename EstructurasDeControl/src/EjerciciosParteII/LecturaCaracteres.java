
package EjerciciosParteII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*4-. Nos piden desarrollar un programa para poder extraer cada uno de los caracteres de una  variable  Stringconteniendo  un  
nombre.  Por  ejemplo  si  ingresamos  el  nombre LETICIA el programa tiene que imprimir lo siguiente:Carácter 1 ->: LCarácter 
2 ->: ECarácter 3 ->: TCarácter 4 ->: ICarácter 5 ->: CCarácter 6 ->: ICarácter 7 ->: A */
public class LecturaCaracteres {
    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresar el nombre: ");
            String nombre = leer.readLine();
            //Pasar todo a mayuscula
            leerCaracteresFor(nombre.toUpperCase());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void leerCaracteresFor(String palabra){
        //for(valor inicial; valor final; incremento)
        for (int i = 0; i < palabra.length(); i++) {
            //palabra.CharAt(i) imprimi el caracter correspondiente a la posicion i
            System.out.println("Caracter: "+ i + "->: "+palabra.charAt(i));
        }
    }
}
