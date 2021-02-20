package advanced.interfaces.example1;

public class Square implements Shape{
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return Math.pow(lenght, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * lenght;
    }
}
