package hbcu.stay.ready.ttime;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;


public class Scientific_FeaturesTest{

/*
    @Before
    public void setup(){
        science = new Calculator();
    }

 */

    @Test
    public void sineFunctionTest(){
        ScientificFeatures science = new ScientificFeatures(7);
        double expected = 0.6569865987187891;
        double actual = science.sineFunction();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void tanFunctionTest(){
        ScientificFeatures science = new ScientificFeatures(7);
        double expected = 0.8714479827243188;
        double actual = science.tanFunction();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void cosineFunctionTest(){
        ScientificFeatures science = new ScientificFeatures(4);
        double expected = -0.6536436208636119;
        double actual = science.cosineFunction();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseSineFunctionTest(){
        ScientificFeatures science = new ScientificFeatures(1);
        double expected = 1.5707963267948966;
        double actual = science.inverseSineFunction();
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void inverseCosFunctionTest(){
        ScientificFeatures science = new ScientificFeatures(1);
        double expected = 0;
        double actual = science.inverseCosFunction();
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void inverseTanFunctionTest(){
        ScientificFeatures science = new ScientificFeatures(1);
        double expected = .7853981633974483;
        double actual = science.inverseTanFunction();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void logFunctionTest(){
        ScientificFeatures science = new ScientificFeatures(2);
        double expected = 0.6931471805599453;
        double actual = science.logFunction();
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void inLogFunctionTest(){
        ScientificFeatures science = new ScientificFeatures(2);
        double expected = 1.4426950408889634;
        double actual = science.inLogFunction();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void naturalLogFunctionTest(){
        ScientificFeatures science = new ScientificFeatures(3);
        double expected = 1.0986122886681098;
        double actual = science.naturalLogFunction();
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void inverseLogTest(){
        ScientificFeatures science = new ScientificFeatures(2);
        double expected = 7.38905609893065;
        double actual = science.inverseLog();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest(){
        ScientificFeatures science = new ScientificFeatures(4);
        double expected = 24;
        double actual = science.factorial();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void switchUnitsModeTest(){

    }
}
