package basics;

import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AsertionExamples {

    @Test
    public void testAssertEquals(){
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(5, 115);

        // then
        assertEquals(120, result);
    }

    @Test
    public void testCalculatorSubtraction(){
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.subtract(5, 115);

        // then
        assertEquals(-110, result);
    }

    @Test
    public void testCalculatordaugyba(){
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.daugyba(5, 115);

        // then
        assertEquals(575, result);
    }

    @Test
    public void testCalculatorDalyba(){
        // given
        Calculator calculator = new Calculator();

        // when
        double result = calculator.dalyba(5, 115);

        // then
        assertEquals(0.043478260869565216, result);
    }
    @Test
    public void testAssertTrueFalse(){
        //given
        int firstNUm = 5;
        int secondNum = 15;
        // when
        boolean condition = firstNUm == secondNum;
        // then
        assertTrue(firstNUm!= secondNum);
        assertFalse(condition);
    }
    @Test
    public void testAssertNulOrNotNull(){
        String emptyText = null;
        String text = "sekamdienis";


        assertNull(emptyText);
        assertNotNull(text);

    }
    @Test
    public void testArrayEquals(){
        // given
        int [] firstArr = {1, 2, 3};
        int [] secondArr = {1, 2, 3};

        // when

        // then
        assertArrayEquals(firstArr, secondArr);
    }

    @Test
    public void testSameOrNotSame(){
        // given
        String text1 = "abc";
        String text2 = "abc";
        String text3 = new String("abc");

        // when

        // then
        assertSame(text1, text2);
        assertNotSame(text2, text3);
    }
}
