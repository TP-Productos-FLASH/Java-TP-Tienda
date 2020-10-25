///TRABAJO FINAL CASO Nro 2 TIENDA - Fecha de entrega 25-10-2020
//GRUPO = 
package trabajofinal_tienda;

public class Producto {
    // DECLARAR VARIABLES DE CLASE PRODUCTO
    private int codigo = 0;
    private String nombre = "";
    private String rubro = "";
    private int porciva = 0;
    private double preciouni = 0;
    private int stkactual = 0;
    private int stkminimo = 0;

    // CONSTRUCTOR SIN PARAMETROS
    public Producto(String nombre, String rubro, double preciouni,
            int stkactual, int stkminimo) {
        this.codigo = codigo + 1;
        this.nombre = nombre;
        this.rubro = rubro;
        this.preciouni = preciouni;
        this.stkactual = stkactual;
        this.stkminimo = stkminimo;
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

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public double getPreciouni() {
        return preciouni;
    }

    public int getStkactual() {
        return stkactual;
    }

    public int getStkminimo() {
        return stkminimo;
    }

    // MOSTRAR PRODUCTO
    public String muestroProducto() {
        return nombre + rubro + porciva + preciouni + stkactual + stkminimo;
    }

    // ASIGNAR PORCENTAJE DE IVA
    public int asignaIva(int porc) {
        porc = 0;
        switch (rubro) {
            case "S":
            case "s":
                porc = 4;
                break;
            case "P":
            case "p":
                porc = 16;
                break;
            case "D":
            case "d":
                porc = 12;
                break;
                default : System.out.println("Rubro ingresado Inexistente");
        }
        return porc;
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
