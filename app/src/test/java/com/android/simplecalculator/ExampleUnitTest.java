package com.android.simplecalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExampleUnitTest {
    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }
    @After
    public void tearDown() {

    }
    //add unit test
    @Test
    public void addTwoNumbers() {
        double result=mCalculator.add(1d,2d);
        assertEquals(result,3d, 0);
    }
    @Test
    public void addTwoNumbersNegative() {
        double result = mCalculator.add(-1d, 2d);
        assertEquals(result, 1d, 0.001);
    }
    @Test
    public void addTwoNumbersNegatives() {
        double result = mCalculator.add(-1d, -2d);
        assertEquals(result, -3, 0.001);
    }
    @Test
    public void addTwoNumbersFloats() {
        double result = mCalculator.add(1.111f, 1.111d);
        assertEquals(result, 2.222d, 0.001);
    }
    @Test
    public void addTwoNumbersNegativeFloats() {
        double result = mCalculator.add(-1d, 2.222f);
        assertEquals(result, 1.222d, 0.001);
    }
    @Test
    public void addTwoNumbersPositiveFloats() {
        double result = mCalculator.add(1d, 2.222f);
        assertEquals(result, 3.222d, 0.001);
    }


    // sub unit test
    @Test
    public void subTwoNumbers() {
        double result = mCalculator.sub(1d, 1d);;
        assertEquals(result, 0d, 0.001);
    }
    @Test
    public void subWorksWithNegativeResult() {
        double result = mCalculator.sub(1d, 16d);
        assertEquals(result, -15d, 0.001);
    }
    @Test
    public void subNegative() {
        double result = mCalculator.sub(-1d, -16d);
        assertEquals(result, 15d, 0.001);
    }
    @Test
    public void subNegativeReverse() {
        double result = mCalculator.sub(16d, -1d);
        assertEquals(result, 17d, 0.001);
    }
    @Test
    public void subTwoNumbersNegativeFloats() {
        double result = mCalculator.sub(-1d, 2.222f);
        assertEquals(result, -3.222d, 0.001);
    }
    @Test
    public void subTwoNumbersFloats() {
        double result = mCalculator.sub(3.333d, 2.222f);
        assertEquals(result, 1.111d, 0.001);
    }


    // multi unit test
    @Test
    public void mulTwoNumbers() {
        double result = mCalculator.mul(16d, 2d);
        assertEquals(result, 32d, 0.001);
    }
    @Test
    public void mulWorksWithNegativeResult() {
        double result = mCalculator.mul(-1d, 16d);
        assertEquals(result, -16d, 0.001);
    }
    @Test
    public void mulWorksWithPositiveResult() {
        double result = mCalculator.mul(-1d, -16d);
        assertEquals(result, 16d, 0.001);
    }
    @Test
    public void mulWorksWithZeroResult() {
        double result = mCalculator.mul(0d, 16d);
        assertEquals(result, 0d, 0.001);
    }
    @Test
    public void mulWorksWithFloatResult() {
        double result = mCalculator.mul(1.5f, 11d);
        assertEquals(result, 16.5f, 0.001);
    }
    @Test
    public void mulWorksWithFloatNegativeResult() {
        double result = mCalculator.mul(-1.5f, 11d);
        assertEquals(result, -16.5f, 0.001);
    }


    //   div unit test
    @Test
    public void divTwoNumbers() {
        double result = mCalculator.div(32d,2d);
        assertEquals(result, 16d, 0.001);
    }
    @Test
    public void divTwoNumbersZero() {
        double result = mCalculator.div(32d,0);
        assertEquals(result, Double.POSITIVE_INFINITY, 0);
    }
    @Test
    public void divWorksWithNegativeResult() {
        double result = mCalculator.div(10d, -2d);
        assertEquals(result, -5d, 0.001);
    }
    @Test
    public void divWorksWithFloatNegativeResult() {
        double result = mCalculator.div(16d, -2.5f);
        assertEquals(result, -6.4d, 0.001);
    }
    @Test
    public void divWorksWithZeroResult() {
        double result = mCalculator.div(0d, 2f);
        assertEquals(result, 0d, 0.001);
    }
    @Test
    public void divWorksWithPositiveResult() {
        double result = mCalculator.div(-16d, -2.5f);
        assertEquals(result, 6.4d, 0.001);
    }


    // Power unit test
    @Test
    public void powTwoNumbers() {
        double result = mCalculator.pow(2d, 3d);
        assertEquals(result, 8d, 0.001);
    }
    @Test
    public void powTwoNumbersNegative() {
        double result = mCalculator.pow(-2d, 3d);
        assertEquals(result, -8d, 0.001);
    }
    @Test
    public void powTwoNumbersPositive() {
        double result = mCalculator.pow(2d, -3d);
        assertEquals(result, 0.125f, 0.001);
    }
    @Test
    public void powTwoNumbersWithOneResult() {
        double result = mCalculator.pow(2d, 0d);
        assertEquals(result, 1d, 0.001);
    }
    @Test
    public void powTwoNumbersFloatResult() {
        double result = mCalculator.pow(2d, 0.5f);
        assertEquals(result, 1.4142f, 0.0001);
    }


    // Factorial unit test
    @Test
    public void factNumbersZero() {
        double result = mCalculator.factorial(0d);
        assertEquals(result, 1d, 0.001);
    }
    @Test
    public void factNumbersOne() {
        double result = mCalculator.factorial(1d);
        assertEquals(result, 1d, 0.001);
    }
    @Test
    public void factNumbersTwo() {
        double result = mCalculator.factorial(2d);
        assertEquals(result, 2d, 0.001);
    }
    @Test
    public void factNumbersThree() {
        double result = mCalculator.factorial(3d);
        assertEquals(result, 6d, 0.001);
    }


    //Logarit unit test
    @Test
    public void logTwoNumbers() {
        double result = mCalculator.log(2d, 3d);
        assertEquals(result, 0.6309d, 0.001);
    }
    @Test
    public void logTwoNumbersFloat() {
        double result = mCalculator.log(2.222f, 3.333f);
        assertEquals(result, 0.6631d, 0.001);
    }
    @Test
    public void logNumbersResultIsOne() {
        double result = mCalculator.log(2d, 2d);
        assertEquals(result, 1d, 0);
    }
    @Test
    public void logNumbersResultIsZero() {
        double result = mCalculator.log(1d, 2d);
        assertEquals(result, 0d, 0);
    }
    @Test
    public void logNumbersResultIsNegative() {
        double result = mCalculator.log(0.5f, 2d);
        assertEquals(result, -1d, 0.1);
    }
}