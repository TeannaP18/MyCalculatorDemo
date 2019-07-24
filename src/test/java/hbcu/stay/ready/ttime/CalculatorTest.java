package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;
import sun.util.calendar.CalendarUtils;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator(10.0);
        double actual = calculator.add(5);
        double expected = 15;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator(10);
        double actual = calculator.subtract(5);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator(2);
        double actual = calculator.multiply(5);
        double expected = 10;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator(5);
        double actual = calculator.divide(5);
        double expected = 1;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void squareTest(){
        Calculator calculator = new Calculator(5);
        double actual = calculator.square();
        double expected = 25;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void squareRoot(){
        Calculator calculator = new Calculator(16);
        double actual = calculator.squareRoot();
        double expected = 4;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void exponent(){
        Calculator calculator = new Calculator(4);
        double actual = calculator.exponent(2);
        double expected = 16;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseNumber(){
        Calculator calculator = new Calculator(4);
        double expected = calculator.inverseNumber();
        double actual = 0.25;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void signSwitchTest(){
        Calculator calculator = new Calculator(1);
        double expected = calculator.signSwitch(1);
        double actual = -1;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void switchUnitsModeTest(){}



    @Test (expected = ArithmeticException.class)
    public void divideZerotest(){
        Calculator calculator = new Calculator(5);
        calculator.divide(0);
    }

}
