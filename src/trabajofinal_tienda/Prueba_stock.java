
package trabajofinal_tienda;

import java.util.Scanner;



 
  public class Prueba_stock
  {
  
  public static void main( String[] args )
  {
 Stock articulo1 = new Stock( 30, 9 ); // crea objeto Cuenta
 Stock articulo2 = new Stock( 15,5 ); 
 Stock articulo3 = new Stock( 20,10 );
 Stock articulo4 = new Stock( 12,11 );
 

// muestra el saldo inicial de cada objeto
 System.out.printf( "Stock de articulo 1: %.2f\n\n ", 
 articulo1.obtenerSaldo() );
 System.out.printf( "Stock de articulo 2: %.2f\n\n",
 articulo2.obtenerSaldo() );
 System.out.printf( "Stock de articulo 3: %.2f\n\n",
 articulo3.obtenerSaldo() );
 System.out.printf( "Stock de articulo 4: %.2f\n\n",
 articulo4.obtenerSaldo() );
 
 
 


 Scanner entrada = new Scanner( System.in );
 double montoStock; 
 System.out.print( "Escriba la cantidad de ingreso/egreso(-)  al art 1: " ); 
 montoStock = entrada.nextDouble(); // obtiene entrada del usuario
 System.out.printf( "\nActualizando %.2f al stock articulo 1\n\n",
 montoStock );
 articulo1.ingreso( montoStock ); // suma al saldo 

 // muestra los saldos
 System.out.printf( "Stock de articulo 1: %.2f\n",
 articulo1.obtenerSaldo() );
 
 articulo1.alerta(); //Muestra Alerta Tope minimo
  System.out.println("                                      ");
 

 System.out.print( "Escriba la cantidad de ingreso/egreso(-)  al art 2: " ); 
 montoStock = entrada.nextDouble(); 
 System.out.printf( "\nActualizando %.2f al stock articulo2\n\n",
montoStock );
 articulo2.ingreso( montoStock ); 

 // muestra los saldos
 
 System.out.printf( "Stock de articulo2: %.2f\n",
 articulo2.obtenerSaldo() );
 
 articulo2.alerta();  
  System.out.println("                                      ");
 
 System.out.print( "Escriba la cantidad de ingreso/egreso(-)  al art 3:" ); 
 montoStock = entrada.nextDouble(); 
 System.out.printf( "\nActualizando %.2f al stock articulo2\n\n",
montoStock );
 articulo3.ingreso( montoStock );

 // muestra los saldos
 
 System.out.printf( "Stock de articulo3: %.2f\n",
 articulo3.obtenerSaldo() );
 
 articulo3.alerta(); 
 System.out.println("                                      ");
 
 System.out.print( "Escriba la cantidad de ingreso/egreso(-)  al art 4: " ); 
 montoStock = entrada.nextDouble(); 
 System.out.printf( "\nActualizando %.2f al stock articulo2\n\n",
montoStock );
 articulo4.ingreso( montoStock ); 

 // muestra los saldos y Alerta
 
 System.out.printf( "Stock de articulo4: %.2f\n",
 articulo4.obtenerSaldo() );

 articulo4.alerta();
  System.out.println("                                      ");
 
 //nuevos saldos
      System.out.println("                                      ");
      System.out.println("          Nuevo Stock                            ");
 System.out.printf( "Stock de articulo 1: %.2f\n\n ", 
 articulo1.obtenerSaldo() );
 System.out.printf( "Stock de articulo 2: %.2f\n\n",
 articulo2.obtenerSaldo() );
 System.out.printf( "Stock de articulo 3: %.2f\n\n",
 articulo3.obtenerSaldo() );
 System.out.printf( "Stock de articulo 4: %.2f\n\n",
 articulo4.obtenerSaldo() );
 

  

 
  





  
  } 
  }
        
        
        
        
    
    

