package basics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test
    public void testAssertJMatchers(){
        //given
        String text = "abc";
        String[] textArr = {"abc", "sdf", "gfd"};
        //when

        //then
        assertThat(textArr)
                .hasSize(3)
                .contains(text)
                .contains("sdf")
                .doesNotContain("aaaaa");
    }

    @Test

    public void shouldAddTwoNUmbers(){
        //given
        int numb1 = 5;
        int numb2 = -1;

        //when
        int result = numb1 + numb2;

        //then
        assertThat(result)
                .isEqualTo(4)
                .isNotEqualTo(6)
                .isLessThan(200)
                .isGreaterThan(-10)
                .isBetween(-99, 8);
    }
}
