import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    public Printer printer;

    @Before
    public void setup(){
        printer = new Printer();
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(3, 5);
        assertEquals(85, printer.getPaper());
    }

    @Test
    public void wontPrintEmpty(){
        printer.print(10, 12);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canRefill(){
        printer.print(3, 10);
        printer.fillPaper();
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void tonerGoesDown(){
        printer.print(2, 5);
        assertEquals(90, printer.getToner());
    }
}
