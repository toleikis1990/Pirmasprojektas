package advanced.generics.generic_class.example2;

public class GarageMain {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

//        CarGarage cargarage = new CarGarage(car);
//        MotorcycleGarage motorcycleGarage = new MotorcycleGarage(motorcycle);
//
//        cargarage.repairCar();
//        motorcycleGarage.repairMotorcycle();

        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);

        carGarage.repairVehicle();
        motorcycleGarage.repairVehicle();
    }
}
