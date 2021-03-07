package fundamentals_testing;

public class Circle {

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int calculateCircleLength(){
        return (int) (2 * Math.PI * radius);
    }

    public int calculateArea (){
        return (int) (Math.pow(radius, 2) * Math.PI);
    }
}
