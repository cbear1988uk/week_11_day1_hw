import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        int calculation = calculator.add(1, 1);
        assertEquals(2, calculation);
    }

    @Test
    public void canSubtract(){
        int calculation = calculator.subtract(3, 1);
        assertEquals(2, calculation);
    }

    @Test
    public void canMultiply(){
        int calculation = calculator.multiply(2, 3);
        assertEquals(6, calculation);
    }

    @Test
    public void canDivide(){
        int calculation = calculator.divide(6, 2);
        assertEquals(3, calculation);
    }

}