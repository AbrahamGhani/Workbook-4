package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldReturnSumOfTwoNumbers() {
        // arrange
        int firstNumber = 2;
        int secondNumber = 4;
        int expectedResult = 6;
        Calculator cn = new Calculator();
        // act
        int actualFunctionResult = cn.add(firstNumber,secondNumber);
        // assert
        assertEquals(expectedResult, actualFunctionResult);

    }
@Test
    void subtract_shouldReturnSubtractionOfTwoNumbers(){
        //arrange
        int firstNumber = 6;
        int secondNumber = 4;
        int expectedResult = 2;
        Calculator cn = new Calculator();
        //act
        int actualFunctionResult = cn.subtract(firstNumber,secondNumber);
        //assert
        assertEquals(expectedResult,actualFunctionResult,"Subtraction should give an accurate result of the first num minus second num");
    }


}