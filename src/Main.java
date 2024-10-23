import java.util.Scanner;

//JUAN MANUEL MEZA

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int oc;

        Carro carro = new Carro("McLaren", 2012 , "Gasolina");
        Camion camion = new Camion("Mercedes", 2012, "Diesel");
        Moto moto = new Moto("Yamaha", 2000, "Gasolina");
        CarroElectrico carroElectrico = new CarroElectrico("Tesla", 2024, "Carga");

        do{
            System.out.println("Vehiculo");
            System.out.println("1. Carro ");
            System.out.println("2. Camion ");
            System.out.println("3. Moto ");
            System.out.println("4. Carro Electrico ");
            System.out.println("5. Salir ");
            oc = teclado.nextInt();


            switch (oc) {
                case 1:

                    System.out.println("Carro:");
                    carro.encender();
                    carro.mostrarinfo();
                    carro.abastecerCombustible();
                    carro.apagar();

                    break;
                case 2:

                    System.out.println("Camion:");
                    camion.encender();
                    camion.mostrarinfo();
                    camion.abastecerCombustible();
                    camion.apagar();

                    break;
                case 3:
                    System.out.println("Moto:");
                    moto.encender();
                    moto.mostrarinfo();
                    moto.abastecerCombustible();
                    moto.apagar();

                    break;

                case 4:
                    System.out.println("CarroElectrico:");
                    carroElectrico.encender();
                    carroElectrico.mostrarinfo();
                    carroElectrico.abastecerCombustible();
                    carroElectrico.apagar();
                    carroElectrico.cargarBateria();
                    System.out.println("Nivel de batería: " + carroElectrico.NivelBateria() + "%");
                    break;

            }




        }while (oc != 5);
        teclado.close();


    }
}