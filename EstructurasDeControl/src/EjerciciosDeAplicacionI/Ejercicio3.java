
package EjerciciosDeAplicacionI;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Ejercicio3 {
     private double IMC;

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double Imc){
        this.IMC = Imc;
    }
    
    public static void main(String[] args) {
        Ejercicio3 ob = new Ejercicio3();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su peso: ");
        double peso = Double.parseDouble(leer.next());
        
        System.out.println("Ingrese su estatura: ");
        double estatura = Double.parseDouble(leer.next());
        ob.clasificacionIMC(peso);
        ob.calcularIMC(peso, estatura);
        
        
    }
    
    public double calcularIMC(double peso, double estatura){
        NumberFormat formato = new DecimalFormat("#0.0");
        double calcIMC;
        calcIMC = peso / (Math.pow(estatura, 2));
        System.out.println("Su Indice de Masa Corporal es de: " + formato.format(calcIMC) );
        this.setIMC(calcIMC);
        return this.getIMC();
    }
    
    public void clasificacionIMC(double IMC){
        String clasificacionImc ="";
        if(IMC < 18 ){
            clasificacionImc = "Peso bajo. Necesario valorar signos de desnutrición";
        }else if(IMC >= 18 && IMC <= 24.9 ){
            clasificacionImc = "Normal";
        }else if(IMC >= 25 && IMC <= 26.9 ){
            clasificacionImc = "Sobrepeso";
        }else if(IMC >= 27 && IMC <= 29.9){
            clasificacionImc = "Obesidad grado 1. Riesgo relativo alto para desarrollar enfermedades cardiovasculares";
        }else if(IMC >= 30 && IMC <= 39.9 ){
            clasificacionImc = "Obesidad grado 2. Riesgo relativo muy alto para el desarrollo de enfermedades cardiovasculares";
        }else if(IMC >= 40 ){
            clasificacionImc = "Obesidad grado 3 Extrema o Mórbida. Riesgo relativo extremadamente alto para el desarrollo de enfermedades cardiovasculares ";
        }
        
        System.out.println("Clasificación: ");
        System.out.println(clasificacionImc);
    }
}