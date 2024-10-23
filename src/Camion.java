public class Camion extends Vehiculo{

    public Camion() {
    }

    public Camion(String marca, int modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void encender() {
        System.out.println("Encendido ");
    }

    @Override
    public void apagar() {
        System.out.println("El Vehiculo esta apagado ");
    }

    @Override
    public void mostrarinfo() {
        System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Combustible: " + getCombustible());
    }
}
