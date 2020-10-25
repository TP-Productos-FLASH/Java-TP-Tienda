//TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO = 
package trabajofinal_tienda;
import java.util.Scanner;
public class Tienda_Venta {
    public static void main(String[] args) {   
   // DECLARAR E INICIALIZAR VARIABLES DE CALCULO
        String bandera="";
        int codiventa=0; int j=0; int nrovta=1;
        int cantprodvta=0; double ivaS=0; double preciofinal=0;
        double estaventa=0; int itemsvta=0;
        double cantvta=0; double acumtotvta=0;
        int actualiza=0; double cuenta1=0; double cuenta2=0; double cuenta3=0; 
        double cuenta4=0; double mayor=0;double menor=0;
        Scanner teclado=new Scanner(System.in);
        //INGRESAR ARTICULOS DE MATRIZ VENTA                             
        Producto b[]=new Producto[4];
        Producto b1=new Producto(1,"Lápiz        ","P",16,10,200,20);
        Producto b2=new Producto(2,"Borrador     ","P",16,75,50,25);
        Producto b3=new Producto(3,"Café         ","S",04,250,100,25);
        Producto b4=new Producto(4,"Desinfectante","S",12,100,80,50); 
    // REGISTRAR VENTAS 
    // DECLARAR E INICIALIZAR ARRAY
        Producto v[]=new Producto[10];
        int otraventa=1;int otroprod=1; int itemsventa=0;
        for (int i=0;i<v.length;i++) {
         while (otraventa==1) {   
             System.out.println("-------------------------------------------");
             System.out.println("| SISTEMA DE VENTAS  -  Venta Nro : "+(nrovta)+"    |");  
             System.out.println("-------------------------------------------");                     
              while (otroprod==1) { //PRODUCTO
                  codiventa=0;
                  System.out.print("Codigo articulo :   ");
                  codiventa=teclado.nextInt();
                  j=codiventa;
                  
    //CALCULAR SEGUN VALOR DE J QUE ES EL CODIGO DE PRODUCTO 
                  switch (j) {
                  case 1 :
                  System.out.println("Producto        : "+b1.getNombre());
                  System.out.println("Precio Unitario : "+b1.getPreciouni());
                  System.out.println("Stock Actual    : "+b1.getStkactual());
                  System.out.print("Ingrese Cantidad:   ");
                  cantprodvta=teclado.nextInt();//UNIDADES VENDIDAS
                  cuenta1=cuenta1+cantprodvta;
                  actualiza=(int) (b1.getStkactual()-cantprodvta);
                  b1.setStockactual(actualiza);
                  ivaS=b1.getPreciouni()*b1.getPorciva()/100;//$IVA  ITEM TOTAL   
                  System.out.println("Iva sobre articulo : "+ivaS);
                  preciofinal=((b1.getPreciouni()+ivaS)*cantprodvta);//$ FINAL ITEM 
                  System.out.println("Precio final del articulo : "+preciofinal);
                  System.out.println("\nNuevo Stock : "+b1.getStkactual());
                  break;
                  case 2 :
                  System.out.println("Producto        : "+b2.getNombre());
                  System.out.println("Precio Unitario : "+b2.getPreciouni());
                  System.out.println("Stock Actual    : "+b2.getStkactual());
                  System.out.print("Ingrese Cantidad:   ");
                  cantprodvta=teclado.nextInt();//UNIDADES VENDIDAS
                  cuenta2=cuenta2+cantprodvta;
                  actualiza=(int) (b2.getStkactual()-cantprodvta);
                  b2.setStockactual(actualiza);                 
                  ivaS=b2.getPreciouni()*b2.getPorciva()/100;//$ IVA ITEM TOTAL   
                  System.out.println("Iva sobre articulo : "+ivaS);
                  preciofinal=((b2.getPreciouni()+ivaS)*cantprodvta);//$ FINAL ITEM          
                  System.out.println("Precio final del articulo : "+preciofinal);
                  System.out.println("\nNuevo Stock : "+b2.getStkactual());
                  break;
                  case 3 :
                  System.out.println("Producto        : "+b3.getNombre());
                  System.out.println("Precio Unitario : "+b3.getPreciouni());
                  System.out.println("Stock Actual    : "+b3.getStkactual());
                  System.out.print("Ingrese Cantidad:   ");
                  cantprodvta=teclado.nextInt();//UNIDADES VENDIDAS
                  cuenta3=cuenta3+cantprodvta;
                  actualiza=(int) (b3.getStkactual()-cantprodvta);
                  b3.setStockactual(actualiza);
                  ivaS=b3.getPreciouni()*b3.getPorciva()/100;//$ IVA ITEM TOTAL   
                  System.out.println("Iva sobre articulo : "+ivaS);
                  preciofinal=((b3.getPreciouni()+ivaS)*cantprodvta);//$ FINAL ITEM             
                  System.out.println("Precio final del articulo : "+preciofinal);
                  System.out.println("\nNuevo Stock : "+b3.getStkactual());
                  break;
                  case 4 :
                  System.out.println("Producto        : "+b4.getNombre());   
                  System.out.println("Precio Unitario : "+b4.getPreciouni());
                  System.out.println("Stock Actual    : "+b4.getStkactual());
                  System.out.print("Ingrese Cantidad:   ");
                  cantprodvta=teclado.nextInt();//UNIDADES VENDIDAS
                  cuenta4=cuenta4+cantprodvta; 
                  actualiza=(int) (b4.getStkactual()-cantprodvta);
                  b4.setStockactual(actualiza);
                  ivaS=b4.getPreciouni()*b4.getPorciva()/100;//$ IVA  ITEM TOTAL   
                  System.out.println("Iva sobre articulo : "+ivaS);
                  preciofinal=((b4.getPreciouni()+ivaS)*cantprodvta);//$ FINAL ITEM            
                  System.out.println("Precio final del articulo : "+preciofinal);
                  System.out.println("\nNuevo Stock : "+b4.getStkactual());
                  break;
                  default : System.out.println("Codigo de artículo inexistente");
                  }                
          
    // ACUMULAR TOTAL DE ESTA VENTA Y CANT DE ITEMS VENDIDOS
                  estaventa=estaventa+preciofinal;
                  cantvta = cantvta+1;
                  itemsventa=itemsventa+1;
                  System.out.println("\nTotal de esta venta : $ "+estaventa);
                  System.out.println("Total items vendidos:   "+itemsventa);
                  System.out.println("\nIngresa mas articulos (1=SI / 0=NO) ");
                  otroprod = teclado.nextInt(); 
                  }       
              System.out.println("CANTIDAD DE ITEMS VENDIDOS :   " +itemsventa);
              System.out.println("EL TOTAL DE ESTA VENTA ES  : $ "+estaventa);
              acumtotvta=acumtotvta+estaventa;
              estaventa=0;
              itemsventa=0;
              System.out.println("-------------------------------- ");
              System.out.println("Ingresa otra venta (1=SI / 0=NO) ");
              otraventa = teclado.nextInt();
              otroprod=1;
           }
        }            
        // LEER Y MOSTRAR LA MATRIZ DE VENTAS  
           for(int i=0; i<v.length;i++){
               System.out.println(" NROVTA "+nrovta+" COD.PROD."+codiventa+
                        " CANT "+cantprodvta+" IVA "+ ivaS+" PREC.FINAL "
                       +preciofinal);
               }
          
    //PREGUNTAR SI QUIERE VER ESTADISTICAS Y MOSTRAR
      System.out.println("\nDESEA VER ESTADISTICAS Y CTROL DE STOCK ? (S/N) :");
      bandera=teclado.next();
      if ((bandera.equals("S"))||(bandera.equals("s"))) {
        // PRODUCTO MAS VENDIDO
        if ((cuenta1>=cuenta2)&&(cuenta1>=cuenta3)&&(cuenta1>=cuenta4)){ 
            mayor=cuenta1;        }                      
        else  if((cuenta2>=cuenta1)&&(cuenta2>=cuenta3)&&(cuenta2>=cuenta4)){
            mayor=cuenta2;        }
        else  if ((cuenta3>=cuenta1)&&(cuenta3>=cuenta2)&&(cuenta3>=cuenta4)){ 
            mayor=cuenta3;        }
        else  if ((cuenta4>=cuenta1)&&(cuenta4>=cuenta2)&&(cuenta4>=cuenta3)){ 
            mayor=cuenta4;        }  
      // PRODUCTO MENOS VENDIDO
        if ((cuenta1<=cuenta2)&&(cuenta1<=cuenta3)&&(cuenta1<=cuenta4)){ 
            menor=cuenta1;        }                      
        else  if((cuenta2<=cuenta1)&&(cuenta2<=cuenta3)&&(cuenta2<=cuenta4)){
            menor=cuenta2;     }
        else  if ((cuenta3<=cuenta1)&&(cuenta3<=cuenta2)&&(cuenta3<=cuenta4)){ 
            menor=cuenta3;        }
        else  if ((cuenta4<=cuenta1)&&(cuenta4<=cuenta2)&&(cuenta4<=cuenta3)){ 
            menor=cuenta4;       }             
        System.out.println("\n----------------");
        System.out.println("  ESTADISTICAS  ");  
        System.out.println("----------------");
        // ESTADISTICAS DE VENTAS 
         System.out.println("Cantidad total de ventas :   "+cantvta+"  ");
         System.out.println("Importe total de ventas  : $ "+acumtotvta);
         System.out.printf ("Valor Promedio de venta  : $ %.2f%n",(acumtotvta/cantvta));
         System.out.println("\nProducto más vendido con "+mayor+" unidades :");
         // CONTROLA DUPLICADOS
         if (cuenta1==mayor) {
            System.out.println(b1.getNombre());
         } if (cuenta2==mayor) {
            System.out.println(b2.getNombre());
        } if (cuenta3==mayor) {
            System.out.println(b3.getNombre());
        } if (cuenta4==mayor) {
           System.out.println(b4.getNombre());
        }
        // CONTROLA DUPLICADOS
         System.out.println("\nProducto menos vendido con "+menor+" unidades :");
         if (cuenta1==menor) {
            System.out.println(b1.getNombre());
         } if (cuenta2==menor) {
            System.out.println(b2.getNombre());
        } if (cuenta3==menor) {
            System.out.println(b3.getNombre());
        } if (cuenta4==menor) {
           System.out.println(b4.getNombre());
        }       
         // REPOSICION DE STOCK
         System.out.println("\n-----------------------");
         System.out.println("   CONTROL DE  STOCK");
         System.out.println("-----------------------");
         b1.repostock();
         b2.repostock();
         b3.repostock();
         b4.repostock();        
      }
    }
}





