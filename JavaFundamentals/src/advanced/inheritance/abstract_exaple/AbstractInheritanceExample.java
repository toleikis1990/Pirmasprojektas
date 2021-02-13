package advanced.inheritance.abstract_exaple;

public class AbstractInheritanceExample {
    public static void main(String[] args) {

        //Vehicle vehicle = new Vehicle(15);
        Car car1 = new Car("Volvo" , 50);
        System.out.println(car1.vehicleMaxSpeed());

        Ship ship = new Ship(50);
        System.out.println(ship.maxSpeed);
    }
}
