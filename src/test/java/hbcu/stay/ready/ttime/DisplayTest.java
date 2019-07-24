package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {

    @Test
    public void switchDisplayTest(){
        Display display = new Display();
        String displayMode = display.switchDisplayMode();
        String expected = "Octal";
        String actual = displayMode;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitsModeTest(){
        Display display = new Display();
        String unitsMode = display.switchUnitsMode();
        String expected = "Radians";
        String actual = unitsMode;
        Assert.assertEquals(expected, actual);
    }

}
