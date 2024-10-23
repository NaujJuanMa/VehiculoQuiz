public abstract class Vehiculo {

protected String marca ;
protected double modelo ;
protected String combustible;

public abstract void encender();
public abstract void apagar();
public abstract void mostrarinfo();

public void abastecerCombustible(){

}

    public Vehiculo() {
    }

    public Vehiculo(String marca, double modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getModelo() {
        return modelo;
    }

    public void setModelo(double modelo) {
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
