
package EjerciciosParteII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Nos  piden  hacer  un  programa  que  determine  el  capital  a  obtener  por  un  ahorrante después de determinados años. 
El programa deberá permitir ingresar el capital inicial, la tasa de interés que rendirá nuestro capital en cada año así como 
el número de años que tendremos el dinero depositado en el banco.Formula del cálculo del interés simple: Interés = Capital x Tasa de Interés x Tiempo 
Debemos  de  calcular  el  interés  devengado  por  nuestro  dinero  ahorrado  al  finalizar cada año. Los intereses devengados son 
adicionados al capital que tenemos ahorrados.Ejemplo:  Si  depositamos  $100  a  5  años  a  una  tasa  de  interés  del  4%,  el  primer  
año ganaremos $4, el segundo año ganaremos $4.16, el tercero $4.32 y así sucesivamente. Suponiendo que el dinero lo retiramos al termino de los 5 años, 
el banco nos devolverá $116.98.*/ 
public class CalcularInteresSimple {
    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("INGRESA LA SIGUIENTE INFORMACION:");
            System.out.println("Cantidad de dinero depoaitada:");
            double cantidad =Double.parseDouble(leer.readLine());
            System.out.println("Cantidad de años del deposito:");
            int anios=Integer.parseInt(leer.readLine());
            System.out.println("Interes anual por el deposito:");
            double interes=Double.parseDouble(leer.readLine());
            interesSimple(cantidad,anios,interes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void interesSimple(double cantidad, int anios, double interes){
        for (int i = 1; i <= anios; i++) {
            double interesPorAnio=cantidad*(interes/100);//calculo de interes anual
            cantidad+=cantidad*(interes/100);//suma a la cantidad actual + el interes de esa cantidad
            System.out.println("Cantidad interes en el año "+i+": "+interesPorAnio);
            System.out.println("Monto interes mas dinero: "+cantidad);
            System.out.println("-----------------------------------");
        }
    }
}
