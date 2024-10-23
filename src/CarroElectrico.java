public class CarroElectrico extends Vehiculo implements VehiculoElectrico{


    public CarroElectrico(String marca, double modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void encender() {
        System.out.println("Vehiculo Encendido ");
    }

    @Override
    public void apagar() {
        System.out.println("El Vehiculo esta apagado ");
    }

    @Override
    public void mostrarinfo() {
        System.out.println("marca: "+ getMarca() + "Modelo : "+ getModelo()+ "Combustible : "+ getCombustible() + "Carro Electrico ");

    }

    @Override
    public void cargarBateria() {

    }

    @Override
    public int NivelBateria() {

        return 50;
    }
}
