
package calculadora1;

import java.util.Scanner;


public class Calculadora1 {

    
    public static void main(String[] args) {
        metodos realizar = new metodos ();
        Scanner entrada = new Scanner(System.in);
        int n1, n2, resultado, opcion;
        boolean op= true;
        while(op) {
            
            System.out.println("**********");
            System.out.println("*Menu*");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("*Seleccione Opcion: ");
            opcion = entrada.nextInt();
            
            if (opcion == 5) {
                System.out.println("**Finalizó**");
                break;
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingresar el 1er. Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingresar el 2do. Valor: ");
                        n2 = entrada.nextInt();
                        resultado = realizar.sumar(n1, n2);
                        System.out.println("**La suma es** " + resultado);
                        break;
                    case 2:
                        System.out.println("Ingresar el 1er. Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingresar el 2do. Valor: ");
                        n2 = entrada.nextInt();
                        resultado = realizar.restar(n1, n2);
                        System.out.println("**La resta es** " + resultado);
                        
                        break;
                    case 3:
                        System.out.println("Ingresar el 1er. Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingresar el 2do. Valor: ");
                        n2 = entrada.nextInt();
                        resultado = realizar.multiplicar(n1, n2);
                        System.out.println("**La multiplicacion es** " + resultado);
                        break;
                    case 4:
                        System.out.println("Ingresar el 1er. Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingresar el 2do. Valor: ");
                        n2 = entrada.nextInt();
                        resultado = realizar.dividir(n1, n2);
                        System.out.println("**La division es** " + resultado);
                        break;
                        
                    default:
                        System.out.println("**Opcion no valida**");
                }
            }
            
        }
    }
    
}
