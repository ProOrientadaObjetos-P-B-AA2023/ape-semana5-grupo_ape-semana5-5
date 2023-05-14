import java.util.Scanner;

public class TestVenta{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE: PRECIO, # PRODUCTOS");
        Venta venta = new Venta(entrada.nextDouble(),entrada.nextInt());
        venta.calcularDescuento();
        venta.calcularPrecioFinal();
        System.out.println(venta);

    }
}

class Venta{
    private double precio;
    private int nProductos;
    private double descuento;

    private double precioFinal;

    public Venta(){}
    public Venta(double precio, int nProductos){
        this.precio=precio;
        this.nProductos=nProductos;
    }

    public double calcularDescuento(){
        if (this.precio >= 1000 && this.nProductos >= 10){
            this.descuento= this.precio*0.10;
            return this.descuento;
        }else {
            this.descuento=this.precio*0.05;
            return this.descuento;
        }
    }

    public double calcularPrecioFinal(){
        this.precioFinal= this.precio-this.descuento;
        return precioFinal;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setnProductos(int nProductos) {
        this.nProductos = nProductos;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }


    public double getPrecio() {
        return precio;
    }

    public int getnProductos() {
        return nProductos;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    @Override
    public String toString() {
        return String.format("Datos\n"+
                "Precio: %.2f\n"+
                "Numero Productos: %d\n"+
                "Descuento: %.2f\n"+
                "Precio Final: %.2f\n",this.getPrecio(),this.getnProductos(),this.getDescuento(),this.getPrecioFinal());
    }
}