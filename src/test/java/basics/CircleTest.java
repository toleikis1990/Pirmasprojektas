package basics;

import fundamentals_testing.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void shouldCalculatePerimeter (){
        //given
        Circle circle = new Circle(10);

        //when
        int result = circle.calculateCircleLength();

        //then
        Assertions.assertEquals(62, result);
    }
    @Test
    public void shouldCalculatePlotas (){
        //given
        Circle circle = new Circle(10);

        //when
        int result = circle.calculateArea();

        //then
        Assertions.assertEquals(314, result);
    }
}
