
package trabajofinal_tienda;

import java.util.Scanner;



 
  public class Prueba_stock
  {
  
  public static void main( String[] args )
  {
 Stock articulo1 = new Stock( 30 ); // crea objeto Cuenta
 Stock articulo2 = new Stock( 15 ); 
 Stock articulo3 = new Stock( 20 );
 Stock articulo4 = new Stock( 12 );
 

// muestra el saldo inicial de cada objeto
 System.out.printf( "Stock de articulo1: %.2f\n\n ", 
 articulo1.obtenerSaldo() );
 System.out.printf( "Stock de articulo2: %.2f\n\n",
 articulo2.obtenerSaldo() );
 System.out.printf( "Stock de articulo3: %.2f\n\n",
 articulo3.obtenerSaldo() );
 System.out.printf( "Stock de articulo4: %.2f\n\n",
 articulo4.obtenerSaldo() );
 
 
 


 Scanner entrada = new Scanner( System.in );
 double montoStock; 
 System.out.print( "Escriba la cantidad a ingresar al art 1: " ); 
 montoStock = entrada.nextDouble(); // obtiene entrada del usuario
 System.out.printf( "\nsumando %.2f al stock articulo1\n\n",
 montoStock );
 articulo1.ingreso( montoStock ); // suma al saldo 

 // muestra los saldos
 System.out.printf( "Stock de articulo1: %.2f\n",
 articulo1.obtenerSaldo() );
 

 System.out.print( "Escriba la cantidad a ingresar al art 2: " ); 
 montoStock = entrada.nextDouble(); 
 System.out.printf( "\nsumando %.2f al stock articulo2\n\n",
montoStock );
 articulo2.ingreso( montoStock ); 

 // muestra los saldos
 
 System.out.printf( "Stock de articulo2: %.2f\n",
 articulo2.obtenerSaldo() );
 
 
 System.out.print( "Escriba la cantidad a ingresar al art 3: " ); 
 montoStock = entrada.nextDouble(); 
 System.out.printf( "\nsumando %.2f al stock articulo2\n\n",
montoStock );
 articulo3.ingreso( montoStock );

 // muestra los saldos
 
 System.out.printf( "Stock de articulo3: %.2f\n",
 articulo3.obtenerSaldo() );
 
 System.out.print( "Escriba la cantidad a ingresar al art 4: " ); 
 montoStock = entrada.nextDouble(); 
 System.out.printf( "\nsumando %.2f al stock articulo2\n\n",
montoStock );
 articulo4.ingreso( montoStock ); 

 // muestra los saldos
 
 System.out.printf( "Stock de articulo4: %.2f\n",
 articulo4.obtenerSaldo() );
 
 
 //nuevos saldos
      System.out.println("                                      ");
      System.out.println("          Nuevo Stock                            ");
 System.out.printf( "Stock de articulo1: %.2f\n\n ", 
 articulo1.obtenerSaldo() );
 System.out.printf( "Stock de articulo2: %.2f\n\n",
 articulo2.obtenerSaldo() );
 System.out.printf( "Stock de articulo3: %.2f\n\n",
 articulo3.obtenerSaldo() );
 System.out.printf( "Stock de articulo4: %.2f\n\n",
 articulo4.obtenerSaldo() );
 

  
  
  }
  
  } 
 
        
        
        
        
    
    

