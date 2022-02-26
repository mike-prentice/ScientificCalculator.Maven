import org.junit.jupiter.api.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

class ScienceCalcTest {

    @Test
    public void sineTest1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 0;
        double expected = 0;

        //When
        double actual = calculator.Sine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void sineTest2() {
        //Given
        Calculator calculator = new Calculator();
        float input = 30;
        double expected = .5;

        //When
        double actual = calculator.Sine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void sineTest3() {
        //Given
        Calculator calculator = new Calculator();
        double input = 90;
        double expected = 1;

        //When
        double actual = calculator.Sine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void sineTest4() {
        //Given
        Calculator calculator = new Calculator();
        double input = 60;
        double expected = .866;

        //When
        double actual = calculator.Sine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void cosineTest1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 0;
        double expected = 1;

        //When
        double actual = calculator.cosine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void cosineTest2() {
        //Given
        Calculator calculator = new Calculator();
        double input = 30;
        double expected = .866;

        //When
        double actual = calculator.cosine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void cosineTest3() {
        //Given
        Calculator calculator = new Calculator();
        double input = 60;
        double expected = .5;

        //When
        double actual = calculator.cosine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void cosineTest4() {
        //Given
        Calculator calculator = new Calculator();
        double input = 90;
        double expected = 0;

        //When
        double actual = calculator.cosine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void tangentTest1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 0;
        double expected = 0;

        //When
        double actual = calculator.tangent(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void tangentTest2() {
        //Given
        Calculator calculator = new Calculator();
        double input = 30;
        double expected = .577;

        //When
        double actual = calculator.tangent(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void tangentTest3() {
        //Given
        Calculator calculator = new Calculator();
        double input = 60;
        double expected = 1.732;

        //When
        double actual = calculator.tangent(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

//    @Test
//    public void tangentTest4() {
//        //Given
//        Calculator calculator = new Calculator();
//        double input = 90;
//        double expected = undefined;
//
//        //When
//        double actual = calculator.cosine(input);
//
//        //Then
//        Assert.assertEquals(expected,actual, .01);
//        System.out.println(expected);
//    }

}