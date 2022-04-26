
package EjerciciosDeAplicacionII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DepreciacionMaquinaria {
   
    
    public static void main(String[] args) {
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in)); 
            
        System.out.println("Ingrese el costo de la maquinaria:");
        double _costoMaquinaria=Double.parseDouble(leer.readLine());
        System.out.println("Ingrese el nombre de la maquinaria:");
        String _nombreMaquinaria=leer.readLine();
        System.out.println("Ingrese la cantidad de äños en el cual sera depreciada la maquina:");
        int _PeriodoTiempo=Integer.parseInt(leer.readLine());
        
            System.out.println("---------------------------");
        System.out.println("Nombre de la Maquinaria: "+_nombreMaquinaria);
        
       calculoDepreciacionDeBienes(_PeriodoTiempo,_costoMaquinaria);
        
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
     public static void calculoDepreciacionDeBienes(int _PeriodoTiempo, double _costoMaquinaria){
         NumberFormat fo=new DecimalFormat("$#,###.##");
         double sumad = ((_PeriodoTiempo*(_PeriodoTiempo+1))/2);
         int b=1;
        for(int i=_PeriodoTiempo; i>=1; i--){ 
        int anio=i;
        
       
        double c=anio/sumad;
        double depre=_costoMaquinaria*c;
            System.out.println("Depreciacion año #"+ b + ": "+fo.format(depre));
             b++;
        }
    }
}
