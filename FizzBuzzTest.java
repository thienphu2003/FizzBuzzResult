import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FizzBuzzTest {
    @Test
     void testUnderZero()
    {
        int number = -1;
        String result = FizzBuzz.checkFizzBuzz(number);
        String expected = "Số nhập vào phải lớn hơn 0 và nhỏ hơn 100";
        assertEquals(expected,result);
    }
    @Test
    void testDivisibleBy3()
    {
        int number = 3;
        String result =FizzBuzz.checkFizzBuzz(number);
        String expected ="Fizz";
        assertEquals(expected,result);
    }
    @Test
    void testDivisibleBy5()
    {
        int number = 5;
        String result =FizzBuzz.checkFizzBuzz(number);
        String expected ="Buzz";
        assertEquals(expected,result);
    }
    @Test
    void testDivisibleBy5And3()
    {
        int number = 15;
        String result =FizzBuzz.checkFizzBuzz(number);
        String expected ="FizzBuzz";
        assertEquals(expected,result);
    }
    @Test
    void testException()
    {
        int number = 19;
        String result =FizzBuzz.checkFizzBuzz(number);
        String expected ="Muoi chin";
        assertEquals(expected,result);
    }

}
