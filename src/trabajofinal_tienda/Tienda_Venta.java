//TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO = 
package trabajofinal_tienda;
import java.util.Scanner;
import java.util.ArrayList;

public class Tienda_Venta {                      
    static ArrayList<Producto> prod=new ArrayList();                       
    static ArrayList<Venta> ventas=new ArrayList();
    public static void main(String[] args) {   
   // DECLARAR E INICIALIZAR VARIABLES DE CALCULO
        Scanner teclado=new Scanner(System.in);
        String bandera="";
        // TODO: implementar esto mejor
        double[] cuenta = new double[4];
        double costoTotal = 0;
        double acumtotvta=0;
        int contadorVentas = 1;
        int codiventa=0;
        int codArticulo=0;
        int cantprodvta=0;
        int cantvta=0;
        int itemsventa = 0;
        boolean otraVenta = true;
        boolean otroProducto = true;

        //INGRESAR ARTICULOS DE MATRIZ PRODUCTOS  
        agregarProducto("Lápiz        ","P",10,200,20);
        agregarProducto("Borrador     ","P",75,50,25);
        agregarProducto("Café         ","S",250,100,25);
        agregarProducto("Desinfectante","S",100,80,50); 
    // REGISTRAR VENTAS 
    // DECLARAR E INICIALIZAR ARRAY
        for (int i=0;i<=10;i++) {
         while (otraVenta) {   
             System.out.println("-------------------------------------------");
             System.out.println("| SISTEMA DE VENTAS  -  Venta Nro : "+(contadorVentas)+"    |");  
             System.out.println("-------------------------------------------");                     
              while (otroProducto) { //PRODUCTO
                  System.out.print("Ingrese el codigo articulo :   ");
                  codArticulo=teclado.nextInt();

    //CALCULAR SEGUN VALOR DE J QUE ES EL CODIGO DE PRODUCTO
                  int codiventaIndex = codArticulo - 1;
                  
                  System.out.println("Producto        : "+prod.get(codiventaIndex).getNombre());
                  System.out.println("Precio Unitario : "+prod.get(codiventaIndex).getPreciouni());
                  System.out.println("Stock Actual    : "+prod.get(codiventaIndex).getStkactual());
                  System.out.print("Ingrese Cantidad:   ");
                  cantprodvta=teclado.nextInt();//UNIDADES VENDIDAS
                  //cuenta1=cuenta1+cantprodvta;

                  int contVentaIndex = contadorVentas - 1;
                  ventas.add(new Venta(prod.get(codiventaIndex), cantprodvta));  
                  prod.get(codiventaIndex).setStockactual(prod.get(codiventaIndex).getStkactual()-cantprodvta);
                  System.out.println("Iva sobre articulo : "+ ventas.get(contVentaIndex).getIvaS(
                        prod.get(codiventaIndex).getRubro()));
                  System.out.println("Precio final del articulo : "+ ventas.get(contVentaIndex).getPreciofinal());
                  System.out.println("\nNuevo Stock : "+prod.get(codiventaIndex).getStkactual());
          
    // ACUMULAR TOTAL DE ESTA VENTA Y CANT DE ITEMS VENDIDOS
                  costoTotal=costoTotal+ventas.get(contVentaIndex).getPreciofinal();
                  cantvta = cantvta+1;
                  itemsventa=itemsventa+1;
                  System.out.println("\nTotal de esta venta : $ "+costoTotal);
                  System.out.println("Total items vendidos:   "+itemsventa);
                  System.out.println("\nIngresa mas articulos (1=SI / 0=NO) ");
                  int otroprod = teclado.nextInt(); 
                  if (otroprod == 0) otroProducto = false;
            }
              System.out.println("CANTIDAD DE ITEMS VENDIDOS :   " +itemsventa);
              System.out.println("EL TOTAL DE ESTA VENTA ES  : $ "+costoTotal);
              acumtotvta=acumtotvta+costoTotal;
              costoTotal=0;
              itemsventa=0;
              System.out.println("-------------------------------- ");
              System.out.println("Ingresa otra venta (1=SI / 0=NO) ");
              int otraventa = teclado.nextInt();
              if (otraventa == 0) otraVenta = false;
           }
        }            
        // LEER Y MOSTRAR LA MATRIZ DE VENTAS  
           for(int i=0; i<ventas.size();i++){
               System.out.println(" NROVTA "+i+" COD.PROD."+ventas.get(i).getProducto().getCodigo()+
                        " CANT "+ventas.get(i).getUnidades()+" IVA "+ ventas.get(i).getIvaS(
                                ventas.get(i).getProducto().getRubro())+" PREC.FINAL "
                       + ventas.get(i).getPreciofinal());
               }
          
    //PREGUNTAR SI QUIERE VER ESTADISTICAS Y MOSTRAR
      /**System.out.println("\nDESEA VER ESTADISTICAS Y CTROL DE STOCK ? (S/N) :");
      bandera=teclado.next().toLowerCase();
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
      } **/
    }
    private static void agregarProducto(String nombre, String rubro, double precioUnidad, int stockActual, int stockMinimo) {
        prod.add(new Producto(nombre, rubro, precioUnidad, stockActual, stockMinimo));
    }
}





