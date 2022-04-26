
import java.util.Scanner;

public class BilletesYMonedas {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 
        // variable que contendra el valor a devolver
        double importe=0;
        do{
            try{
                System.out.println("Ingresa el tiempo de la llamda en minutos:");
                int tiempo=sc.nextInt();
                System.out.println("MONTO A PAGAR:");
                
                if (tiempo==3){
                    importe=0.20;
                    System.out.println("$"+importe);
                }
                else if(tiempo>3){
                    int tiempoA=tiempo-3;
                    double tiempoAdicional=(tiempoA*0.05)+0.20;
                    
                    importe=tiempoAdicional;
                    System.out.println("$"+tiempoAdicional);
                }
                
                

            }catch(Exception e){
                System.out.println("Introduciste un dato erroneo.");
                System.out.println("");
                sc.nextLine();
            }
        }
        while(importe<=0);
 
        calcular(importe);
    }
 
    public static void calcular(double importe)
    {

        // Indicamos todas las monedas posibles
        double [] monedas={20,10,5,1,0.25,0.10,0.05,0.01};
 
        // Creamos un array con 0 de longitud igual a la cantidad de monedas
        // Este array contendra las monedas a devolver
        double [] devolver={0,0,0,0,0,0,0,0};
 
        // Recorremos todas las monedas
        for(int i=0;i<monedas.length;i++)
        {
            // Si el importe actual, es superior a la moneda
            if(importe>=monedas[i])
            {
                // obtenemos cantidad de monedas
                devolver[i]=Math.floor(importe/monedas[i]);
 
                // actualizamos el valor del importe que nos queda por didivir
                importe=importe-(devolver[i]*monedas[i]);
            }
        }
 
        // Bucle para mostrar el resultado
        for(int i=0;i<monedas.length;i++)
        {
            if(devolver[i]>0)
            {
                if(monedas[i]>2)
                {
                    // Indicamos que es un billete
                    System.out.println(devolver[i]+" billetes de: $"+monedas[i]);
                }else{
                    // Indicamos que es una moneda
                    System.out.println(devolver[i]+" monedas de: ¢"+monedas[i]);
                }
                
            }
        }
    }
 
}