//TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO : HERNAN, FERNANDO BARRIOS, ALEXANDER MARINO, LEANDRO TAPPA, SILVINA RONZONI
package trabajofinal_tienda;
public class Prueba_Producto {
    
    private int codigo;
    private String nombre;
    private String rubro;
    private int stockactual;
    private int stockminimo;
    private double preciouni;
    private double iva;
    private double preciofinal;
    
    public static void main(String[] args) {
    
    //ASIGNAR VALORES A PRODUCTOS
    
    Producto prod1=new Producto ( 01,"Lápiz        ","P",30,9,8,0,0);
    prod1.setIva(16);
    prod1.PrecioFinal();
    
    Producto prod2=new Producto ( 02,"Borrador     ","P",15,5,5,0,0);
    prod2.setIva(16);
    prod2.PrecioFinal();
    
    Producto prod3=new Producto ( 03,"Café         ","S",20,10,250,0,0);
    prod3.setIva(4);
    prod3.PrecioFinal();
    
    Producto prod4=new Producto ( 03,"Desinfectante","D",12,11,138,0,0);
    prod4.setIva(12);
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
