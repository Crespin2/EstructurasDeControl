
package estructuras.condicionales;


public class Ejer2 {
   private double total_ventas;
   private double comision;
   private double salario;
   private double salario_total;
   private double renta;

    public double getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(double total_ventas) {
        this.total_ventas = total_ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario_total() {
        return salario_total;
    }

    public void setSalario_total(double salario_total) {
        this.salario_total = salario_total;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }
   
    public double Calcular_comision(double total_ventas){
     double Comision=0.0;
     if(total_ventas>=3000){
        Comision = total_ventas*0.10;
   }else if((total_ventas < 1000) && total_ventas>=2999){
         Comision=total_ventas*0.08;
     }
   else if((total_ventas>=1)&& (total_ventas< 999)){
         Comision=total_ventas*0.05;
     }
    this.setComision(Comision);
     return Comision;
}
  public  double Calcular_salar(){
      double salario;
      salario= 300 + this.getComision();
      this.setSalario(salario);
      return salario;
  }
  public double Calcular_Renta(){
      double renta;
      renta=this.getSalario()*0.10;
      this.setRenta(renta);
      return renta;
      
  }
  public double calcular_SalarioTotal(){
      double salarioTotal;
      salarioTotal= this.getSalario()-this.getRenta();
      this.setSalario_total(salarioTotal);
      return salarioTotal;
  }
   
}
