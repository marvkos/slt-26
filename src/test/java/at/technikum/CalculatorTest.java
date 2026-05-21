package at.technikum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void when_1_plus_1_then_2() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 1;
        // Act
        int result = calculator.add(a, b);
        // Assert
        assertEquals(2, result);
    }

    @Test
    public void when_1_plus_3_then_4() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 3;
        // Act
        int result = calculator.add(a, b);
        // Assert
        assertEquals(4, result);
    }


}
