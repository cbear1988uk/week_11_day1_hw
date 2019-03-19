
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        int drinking = waterBottle.takeDrink(100, 10);
        assertEquals(90, drinking);
    }

    @Test
    public void canEmpty(){
        int emptying = waterBottle.empty(90);
        assertEquals(0, emptying);
    }

    @Test
    public void canFill(){
        int filling = waterBottle.fill(50, 50);
        assertEquals(100, filling);
    }
}
