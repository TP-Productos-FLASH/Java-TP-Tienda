//TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO : HERNAN FIGUEROA, FERNANDO BARRIOS, ALEXANDER MARINO, LEANDRO TAPPA, SILVINA RONZONI
package trabajofinal_tienda;
public class Prueba_Producto {
    
    private double preciofinal;
    
    public static void main(String[] args) {
    
    //ASIGNAR VALORES A PRODUCTOS
    ProductoOld prod1=new ProductoOld ( 01,"Lápiz        ","P",30,9,8,0,0);
    prod1.PrecioFinal();
    ProductoOld prod2=new ProductoOld ( 02,"Borrador     ","P",15,5,5,0,0);
    prod2.PrecioFinal();
    ProductoOld prod3=new ProductoOld ( 03,"Café         ","S",20,10,250,0,0);
    prod3.PrecioFinal();
    ProductoOld prod4=new ProductoOld ( 03,"Desinfectante","D",12,11,138,0,0);
    prod4.PrecioFinal();

    //MOSTRAR PRODUCTOS
    System.out.print("Codigo"+" "+"Producto               ");
    System.out.println("Rubro"+"   "+"Stock Act"+"    "+"Stock Min"+"    "+"P.Unit."+"    "+"IVA"+"    "+"P.Total");
    System.out.println("                   ");
    prod1.mostrarProducto();
    prod2.mostrarProducto();
    prod3.mostrarProducto();
    prod4.mostrarProducto();
    }
}