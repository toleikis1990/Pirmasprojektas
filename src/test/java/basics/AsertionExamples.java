package basics;

import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AsertionExamples {

    @Test
    public void testAssertEquals(){
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(5, 115);

        // then
        Assertions.assertEquals(120, result);
    }

    @Test
    public void testCalculatorSubtraction(){
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.subtract(5, 115);

        // then
        Assertions.assertEquals(-110, result);
    }

    @Test
    public void testCalculatordaugyba(){
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.daugyba(5, 115);

        // then
        Assertions.assertEquals(575, result);
    }

    @Test
    public void testCalculatorDalyba(){
        // given
        Calculator calculator = new Calculator();

        // when
        double result = calculator.dalyba(5, 115);

        // then
        Assertions.assertEquals(0.043478260869565216, result);
    }
    @Test
    public void testAssertTrueFalse(){
        //given
        int firstNUm = 5;
        int secondNum = 15;
        // when
        boolean condition = firstNUm == secondNum;
        // then
        Assertions.assertTrue(firstNUm!= secondNum);
        Assertions.assertFalse(condition);
    }
    @Test
    public void testAssertNulOrNotNull(){
        String emptyText = null;
        String text = "sekamdienis";


        Assertions.assertNull(emptyText);
        Assertions.assertNotNull(text);

    }
    @Test
    public void testArrayEquals(){
        // given
        int [] firstArr = {1, 2, 3};
        int [] secondArr = {1, 2, 3};

        // when

        // then
        Assertions.assertArrayEquals(firstArr, secondArr);
    }

    @Test
    public void testSameOrNotSame(){
        // given
        String text1 = "abc";
        String text2 = "abc";
        String text3 = new String("abc");

        // when

        // then
        Assertions.assertSame(text1, text2);
        Assertions.assertNotSame(text2, text3);
    }
}
