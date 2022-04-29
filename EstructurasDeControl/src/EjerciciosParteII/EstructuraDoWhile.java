/*3-. Crear otra clase con el nombre EstructuraDoWhile y se realizará el ejemplo 
anterior y verificar su funcionamiento; el código es el siguiente:*/

package EjerciciosParteII;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraDoWhile {
    public static void main(String[] args) {
        try{
           BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresar un numero limite de repeticion: ");
            String limite = leer.readLine();
            //Casting o conversion de datos al momento de envio
            instruccionDoWhile(Integer.parseInt(limite));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void instruccionDoWhile(int valorLimite) {
        int i = 1; //Valor inicial del contador
        do{//Realiza por lo menos una vez la accion 
            System.out.println("El valor de la repeticion es: " + i);
            i++; //Incremento del contador    
        }while(i <= valorLimite);//Evalua la condicion antes de volver a repetir 
    }
}
