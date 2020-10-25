//TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO = 
package trabajofinal_tienda;
public class Venta extends Producto {

    //DECLARAR VARIABLES DE CLASE VENTA OTRO
    private int nrovta=0;
    private double codiventa=0;
    private int cantprodvta=0;
    private double ivaS=0;
    private double preciofinal=0;
    
     //CONSTRUCTOR CON HERENCIA DE PRODUCTO
    public Venta(int nrovta, int codiventa, int cantprodvta, double ivaS, 
            double preciofinal,int codigo,String nombre,String rubro,int 
            porciva,double preciouni, int stkactual, int stkminimo) {
        super(codigo, nombre, rubro, porciva, preciouni, stkactual, stkminimo);
    }

    // SETTERS
    public void setNrovta(int nrovta) {
        this.nrovta = nrovta;
    }
    public void setCodiventa(double codiventa) {
        this.codiventa = codiventa;
    }
    public void setCantprodvta(int cantprodvta) {
        this.cantprodvta = cantprodvta;
    }
    public void setIvaS(double ivaS) {
        this.ivaS = ivaS;
    }
    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }
    //GETTERS

    public double getNrovta() {
        return nrovta;
    }
    public double getCodiventa() {
        return codiventa;
    }
    public int getCantprodvta() {
        return cantprodvta;
    }
    public double getIvaS() {
        return ivaS;
    }
    public double getPreciofinal() {
        return preciofinal;
    }
    
    @Override
    public String muestroProducto(){
        return (super.getCodigo()+getNombre()+super.getRubro()+
                super.getPorciva()+super.getPreciouni()+super.getStkactual()
                +super.getStkminimo());
    }        
}