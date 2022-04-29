
package EjerciciosDeAplicacionI;

import EjerciciosDeAplicacionI.Ejer2;
import java.util.Scanner;
/*2-. La  empresa  Compu Smart  se  dedica  a  la  venta  de  equipos  de  computación.  
Vende tanto computadoras como dispositivos periféricos y  consumibles. 
La empresa cuenta con un grupo de 5 vendedores a los cuales les paga la comisión según el rango de la venta efectuada. 
Si el vendedor vende de $3000 en adelante la comisión es el 10%, si vende  de $1000 a $2999 gana el 8% 
y si la venta es de  1$ a $999 gana un 5%. 
Pero cada vendedor tiene un salario base de $300  al cual se le suma el valor de la comisión por ventas. Determinar el salario  
líquido  de un vendedor según el monto de la venta realizada tomando en cuenta que se descuenta el 10% en concepto de renta. */

public class Ejer2_parte1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ejer2 Calculo = new Ejer2();
        
        double venta;
        
        System.out.println("Ingrese ventas del empleado:");
        venta=leer.nextDouble();
        
        System.out.println("Ventas del empleado:");
        Calculo.setTotal_ventas(venta);
        Calculo.Calcular_comision(venta);
        Calculo.Calcular_salar();
        Calculo.calcular_SalarioTotal();
        Calculo.Calcular_Renta();
        System.out.println("La comision del empleado es: "+Calculo.getComision());
        System.out.println("El salario mas comision es: " +Calculo.getSalario());
        System.out.println("El salario total es: "+Calculo.getSalario_total());
        System.out.println("El desceunto de la renta es:"+Calculo.getRenta());
   }
        
   } 

   
    
   

