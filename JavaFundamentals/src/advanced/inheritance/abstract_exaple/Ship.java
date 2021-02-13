package advanced.inheritance.abstract_exaple;

public class Ship extends Vehicle {

    public Ship(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed + 50;


    }
}
