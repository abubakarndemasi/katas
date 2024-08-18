package com.icloud.abuumbuchu.fizzbuzz.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void FizzBuzzConvertOne(){
    // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer one = 1;
        
        // Assert
        assertEquals("1", unit.convert(one));
        
    }

    @Test
    public void FizzBuzzConvertTwo(){
        // Arrange
        FizzBuzz unit = new FizzBuzz();
        // Act
        Integer two = 2;

        // Assert
        assertEquals("2", unit.convert(two));

    }

}
