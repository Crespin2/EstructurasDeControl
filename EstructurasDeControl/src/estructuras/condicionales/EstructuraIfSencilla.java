
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EstructuraIfSencilla {
    public static void main(String[] args) {
        try{ //Objeto de la clase BufferedReader
         BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar la cantidad de su salario");
            double salario = Double.parseDouble(leer.readLine());
            ifSencilla(salario); //Envia el valor de salario a serr evaluado al metodo
            }catch (Exception e){
                System.out.println(e.getMessage());
         
            }
      }
    
    public static void ifSencilla(double salario){
        if(salario > 235){ //La condicion que se evalua y en caso de ser verdaera
            System.out.println("Usted gana mas del salario minimo");
        }
    }
}
    

