//TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO : HERNAN FIGUEROA, FERNANDO BARRIOS, ALEXANDER MARINO, LEANDRO TAPPA, SILVINA RONZONI
package trabajofinal_tienda;

public class ProductoOld {
   // DECLARAR VARIABLES 
    private int codigo;
    private String nombre;
    private String rubro;
    private int stockactual;
    private int stockminimo;
    private double preciouni;
    private double iva;
    private double preciofinal;
    
    // CONSTRUCTOR CON PARAMETROS
    public ProductoOld (int codigo, String nombre, String rubro, int stockactual, int stockminimo, double preciouni, double iva, double preciofinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.rubro = rubro;
        this.stockactual = stockactual;
        this.stockminimo = stockminimo;
        this.preciouni = preciouni;
        this.iva = iva;
        this.preciofinal = preciofinal;
    }
         
    // SETTERS
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    public void setStockactual(int stockactual) {
        this.stockactual = stockactual;
    }
    public void setStockminimo(int stockminimo) {
        this.stockminimo = stockminimo;
    }
    public void setPreciouni(double preciouni) {
        this.preciouni = preciouni;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }
    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    //GETTERS
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRubro() {
        return rubro;
    }
    public int getStockactual() {
        return stockactual;
    }
    public int getStockminimo() {
        return stockminimo;
    }
    public double getPreciouni() {
        return preciouni;
    }
    public double getIva() {
        return iva;
    }  
    public double getPreciofinal() {
        return preciofinal;
    }
    
    //METODO PARA ASIGNAR IVA SEGUN RUBRO Y CALCULAR PRECIO FINAL
    public void PrecioFinal(){
        switch (rubro){    
        case "P": case "p":
        setIva(16);
        break;
        case "S": case "s":
        setIva(4);
        break;
        case "D": case "d":
        setIva(12);
        break;
    }
    preciofinal=(preciouni+(preciouni*iva/100));
    }
    
    //METODO PARA MOSTRAR PRODUCTOS 
    public void mostrarProducto(){ 
        System.out.print("  "+codigo+"    "+nombre+"         ");        
        System.out.println("   "+rubro+"        "+stockactual+"           "+stockminimo+"       "+preciouni+"      "+iva+"     "+preciofinal);
    }    
}