package advanced.inheritance.abstract_exaple;

public abstract class Vehicle {

    protected int maxSpeed;

    public Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;

    }
    public abstract int vehicleMaxSpeed();
}
