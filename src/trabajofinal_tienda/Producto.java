///TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO : HERNAN FIGUEROA, FERNANDO BARRIOS, ALEXANDER MARINO, LEANDRO TAPPA, SILVINA RONZONI
package trabajofinal_tienda;

public class Producto {
    // DECLARAR VARIABLES DE CLASE PRODUCTO
    private int codigo = 0;
    private String nombre = "";
    private String rubro = "";
    private double preciouni = 0;
    private int stkactual = 0;
    private int stkminimo = 0;
    private int unidadesVendidas;

    // CONSTRUCTOR SIN PARAMETROS
    public Producto(String nombre, String rubro, double preciouni,
            int stkactual, int stkminimo) {
        this.codigo = codigo + 1;
        this.nombre = nombre;
        this.rubro = rubro;
        this.preciouni = preciouni;
        this.stkactual = stkactual;
        this.stkminimo = stkminimo;
        this.unidadesVendidas = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public void setPreciouni(double preciouni) {
        this.preciouni = preciouni;
    }

    public void setStockactual(int stkactual) {
        this.stkactual = stkactual;
    }

    public void setStockminimo(int stkminimo) {
        this.stkminimo = stkminimo;
    }

    public void updateUnidadesVendidas(int unidades) {
        this.unidadesVendidas = this.unidadesVendidas + unidades;
    }

    //GETTERS
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getRubro() {
        return this.rubro;
    }

    public double getPreciouni() {
        return this.preciouni;
    }

    public int getStkactual() {
        return this.stkactual;
    }

    public int getStkminimo() {
        return this.stkminimo;
    }

    public int getUnidadesVendidas() {
        return this.unidadesVendidas;
    }

    // MOSTRAR PRODUCTO
    public String muestroProducto() {
        return this.nombre + this.rubro + this.preciouni + this.stkactual + this.stkminimo;
    }

    // REPOSICION DE 
    public void repostock() {
        if (stkactual <= stkminimo) {
            System.out.println("\nHacer Pedido de Reposicion del artículo " + nombre);
            System.out.println("Stock actual : " + stkactual + "  igual o debajo del"
                    + " Stock Minimo" + " ( " + stkminimo + " )");
            System.out.println("               ");
        } else {
            System.out.println("Producto : " + nombre + " con valores mínimos de stock garantizados");
        }
    }
}
