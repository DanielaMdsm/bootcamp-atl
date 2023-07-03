package clase10;

public class Cuenta {
    private String titular;
    private float cantidad;

    public Cuenta(){}

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarDatos(){
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("cantidad: "+ cantidad);

    }
    public void ingresar(float cantidadIngresar) {
        if(cantidadIngresar>0 ){
            cantidad+=cantidadIngresar;
        }
    }
    public void retirar(float cantidadRetirar) {
            cantidad-=cantidadRetirar;

    }
}
