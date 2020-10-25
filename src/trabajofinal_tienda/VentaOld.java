//TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO : HERNAN FIGUEROA, FERNANDO BARRIOS, ALEXANDER MARINO, LEANDRO TAPPA, SILVINA RONZONI
package trabajofinal_tienda;
import java.util.Scanner; 

public class VentaOld {
//DECLARAR VARIABLES DE CLASE VENTA
    private int codprodvta=0;
    private double preciofinal=0;
    private double iva$=0;
    private int cantuniventa=0;
    private double estaventa=0;
    private double acumtotventa=0;

// CONSTRUCTOR CON PARAMETROS DE CLASE VENTA + PARAMETROS DE SUPERCLASE PRODUCTO 
    VentaOld(int codprodvta, int cantuniventa, double preciofinal,double iva$,
            double estaventa,double acumtotventa) {
    }
// SETTERS

    public void setCodprodvta(int codprodvta) {
        this.codprodvta = codprodvta;
    }
    public void setIva(double iva$) {
        this.iva$ = iva$;
    }   
    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }
    public void setCantuniventa(int cantuniventa) {
        this.cantuniventa = cantuniventa;
    }
    public void setEstaventa(double estaventa) {
        this.estaventa = estaventa;
    }
    public void setAcumtotventa(double acumtotventa) {
        this.acumtotventa = acumtotventa;
    }
//GETTERS

    public int getCodprodvta() {
        return codprodvta;
    }
    public double getPreciofinal() {
        return preciofinal;
    }
    public double getIva$() {
        return iva$;
    }
    public int getCantuniventa() {
        return cantuniventa;
    }
    public double getEstaventa() {
        return estaventa;
    }
    public double getAcumtotventa() {
        return acumtotventa;
    }
    
 // METODO PARA REGISTRAR VENTAS 
    // DECLARAR E INICIALIZAR VARIABLE CONTADOR DE VENTAS  
    public void HagoVenta(){
    int otraventa=1;int otroprod=1; int itemsventa=0;
    int A=0;int B=0;
    int fila=50; int columna=5;
    int tabla[][] =new int[fila][columna];
    
    //DECLARAR E INICIALIZAR VARIABLES DE CALCULO        
     Scanner teclado = new Scanner(System.in);
    //INGRESAR ARTICULOS DE VENTA EN MATRIZ, un For para filas y otro For para columna            
        for(A=0; A<tabla.length;A++) { // CLIENTE  
          if (otraventa==1){ // CLIENTE
            System.out.println("-------------------------------------------");
            System.out.println("| SISTEMA DE VENTAS  -  Venta Nro : "+(A+1)+"     |");  
            System.out.println("-------------------------------------------");
            for(B=0; B<=tabla.length;B++){ //PRODUCTO           
              if (otroprod==1) { //PRODUCTO
                  System.out.print("Codigo articulo :   ");
                  codprodvta=teclado.nextInt();
                  B=0;
                  //ACA FALTA TRAER EL NOMBRE Y EL RUBRO DESDE CLASE PRODUCTO
                  tabla[A][B]=codprodvta;// TABLA POSICION 00                                                 
                  System.out.print("Cantidad :   ");
                  tabla[A][B]=teclado.nextInt();//TABLA POSICION 01
                  B++;
                  //ACA FALTA TRAER PRECIO UNITARIO DE LA CLASE PRODUCTO Y MULTIPLICARLO POR CANTIDAD DE UNIDADES
                  
                  //ACA FALTA TRAER EL METODO AsignaIva() DE LA CLASE PRODUCTO Y MULTIPLICARLO POR EL RESULTADO DE ARRIBA
                  tabla[A][B]=(int) iva$;//TABLA POSICION 02                  
                  B++;                  
                  preciofinal=6+iva$;// EL 6 ES UN VALOR DE PRUEBA PARA QUE EJECUTE EL PRG
                  tabla[A][B]=(int) preciofinal;//TABLA POSICION 03 
                  B++;
                  // EL 100 ES UN VALOR DE PRUEBA PARA QUE EJECUTE EL PRG
                  estaventa=estaventa+100;//ACUMULAR PRECIO FINAL DEL ARTICULO * CANT UNIDADES
                  tabla[A][B]=(int) estaventa;//TABLA POSICION 04                 
                  itemsventa=itemsventa+1;
                  System.out.println("      "); 
                  System.out.println("Ingresa mas articulos (1=SI / 0=NO) ");
                  otroprod = teclado.nextInt(); 
              }//Otroprod  
            } 
              B=0;//for B
              otroprod=1;
              System.out.println("CANTIDAD DE ITEMS VENDIDOS :   " +itemsventa);
              System.out.println("EL TOTAL DE ESTA VENTA ES  : $ "+estaventa);      
              System.out.println("-------------------------------- ");
              System.out.println("Ingresa otra venta (1=SI / 0=NO) ");
              otraventa = teclado.nextInt();       
           }   
       }  
    }
}
