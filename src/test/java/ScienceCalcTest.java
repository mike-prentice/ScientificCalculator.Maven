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
        double actual = calculator.sine(input);

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
        double actual = calculator.sine(input);

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
        double actual = calculator.sine(input);

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
        double actual = calculator.sine(input);

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
//        double expected = Double.NaN;
//
//        //When
//        double actual = calculator.tangent(input);
//
//        //Then
//        Assert.assertEquals(expected,actual, .000000000000001);
//        System.out.println(expected);
//    }

    @Test
    public void inverseSineTest1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 0;
        double expected = 0;

        //When
        double actual = calculator.inverseSine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseSineTest2() {
        //Given
        Calculator calculator = new Calculator();
        double input = .5;
        double expected = 30;

        //When
        double actual = calculator.inverseSine(input);

        //Then
        assertEquals(expected, actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseSineTest3() {
        //Given
        Calculator calculator = new Calculator();
        double input = .866;
        double expected = 60;

        //When
        double actual = calculator.inverseSine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseSineTest4() {
        //Given
        Calculator calculator = new Calculator();
        double input = 1;
        double expected = 90;

        //When
        double actual = calculator.inverseSine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }
    @Test
    public void inverseCosineTest1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 0;
        double expected = 90;

        //When
        double actual = calculator.inverseCosine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseCosineTest2() {
        //Given
        Calculator calculator = new Calculator();
        double input = .5;
        double expected = 60;

        //When
        double actual = calculator.inverseCosine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseCosineTest3() {
        //Given
        Calculator calculator = new Calculator();
        double input = .866;
        double expected = 30;

        //When
        double actual = calculator.inverseCosine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseCosineTest4() {
        //Given
        Calculator calculator = new Calculator();
        double input = 1;
        double expected = 0;

        //When
        double actual = calculator.inverseCosine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseTangentTest1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 1;
        double expected = 0;

        //When
        double actual = calculator.inverseCosine(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }
    @Test
    public void naturalLongTest1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 2;
        double expected = .693;

        //When
        double actual = calculator.naturalLog(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void naturalLongTest2() {
        //Given
        Calculator calculator = new Calculator();
        double input = -2;
        double expected = Double.NaN;

        //When
        double actual = calculator.naturalLog(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void logTest1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 1;
        double expected = 0;

        //When
        double actual = calculator.log(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void logTest2() {
        //Given
        Calculator calculator = new Calculator();
        double input = 412;
        double expected = 2.614;

        //When
        double actual = calculator.log(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void logTest3() {
        //Given
        Calculator calculator = new Calculator();
        double input = -3;
        double expected = Double.NaN;

        //When
        double actual = calculator.log(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseLn1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 1 ;
        double expected = 2.718;

        //When
        double actual = calculator.inverseLn(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseLn2() {
        //Given
        Calculator calculator = new Calculator();
        double input = 5 ;
        double expected = 148.413;

        //When
        double actual = calculator.inverseLn(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseLog1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 5 ;
        double expected = 100000;

        //When
        double actual = calculator.inverseLog(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseLog2() {
        //Given
        Calculator calculator = new Calculator();
        double input = .20 ;
        double expected = 1.584;

        //When
        double actual = calculator.inverseLog(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void inverseLog3() {
        //Given
        Calculator calculator = new Calculator();
        double input = -5 ;
        double expected = .00001;

        //When
        double actual = calculator.inverseLog(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void cubeRoot1() {
        //Given
        Calculator calculator = new Calculator();
        double input = 27 ;
        double expected = 3;

        //When
        double actual = calculator.cubeRoot(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void cubeRoot2() {
        //Given
        Calculator calculator = new Calculator();
        double input = -8 ;
        double expected = -2;

        //When
        double actual = calculator.cubeRoot(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }

    @Test
    public void cubeRoot3() {
        //Given
        Calculator calculator = new Calculator();
        double input = -.015625;
        double expected = -.25;

        //When
        double actual = calculator.cubeRoot(input);

        //Then
        Assert.assertEquals(expected,actual, .01);
        System.out.println(expected);
    }



}