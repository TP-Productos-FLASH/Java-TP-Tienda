package trabajofinal_tienda;
    
public class Stock
  {
 private double saldo; // variable de instancia que almacena el saldo
 
 private double topeMin;
 
 
 
public Stock( double stockInicial,double topeMin )
 { this.topeMin= topeMin;



 
 
 if ( stockInicial > 0.0 )
saldo = stockInicial;
} 


 public void ingreso( double cant )
 {
 saldo = saldo + cant; // suma el monto al saldo
 } 

 // devuelve el saldo de la cuenta
public double obtenerSaldo()
 { return saldo; 
 } 


 
   
           
  public void alerta (){
  if (saldo <= topeMin) 
      System.out.println("Alerta Tope minino Contactar proveedor "+ topeMin);       
      
      
 
   }

}