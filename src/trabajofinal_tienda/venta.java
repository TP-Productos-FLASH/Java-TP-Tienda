//TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO = 
package trabajofinal_tienda;
public class Venta {

    //DECLARAR VARIABLES DE CLASE VENTA OTRO
    private int nrovta=0;
    private double codiventa=0;
    private int cantprodvta=0;
    private double ivaS=0;
    private double preciofinal=0;
    private Producto prod;
    
     //CONSTRUCTOR
    public Venta(Producto prod, int unidades) {
        this.nrovta = nrovta++;
        this.cantprodvta = unidades;
        this.preciofinal = this.getPreciofinal(prod, unidades);
        this.prod = prod;
    }

    // SETTERS
    public void setUnidades(int cantprodvta) {
        this.cantprodvta = cantprodvta;
    }
    //GETTERS

    public double getNrovta() {
        return this.nrovta;
    }
    public int getUnidades() {
        return cantprodvta;
    }
    public double getIvaS() {
        return ivaS;
    }

    public Producto getProducto() {
        return this.prod;
    }
    
    public double getPreciofinal(Producto prod, int unidades) {
        double porc = 0;
        String rubro = prod.getRubro();
        switch (rubro.toLowerCase()) {
            case "s":
                porc = 1.04;
                break;
            case "p":
                porc = 1.16;
                break;
            case "d":
                porc = 1.12;
                break;
            default:
                System.out.println("Rubro ingresado Inexistente");
                break;
        }
        return (prod.getPreciouni() * unidades * porc);
    }
}