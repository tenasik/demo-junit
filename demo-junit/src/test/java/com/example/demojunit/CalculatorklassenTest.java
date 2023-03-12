package com.example.demojunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorklassenTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new Calculatorklassen();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void twoPlusFourShouldEqualSix() {
        var calculator = new Calculatorklassen();
        assertEquals(6, calculator.add(2, 4));
    }

    @Test
    void onePlusFiveShouldEqualSix() {
        var calculator = new Calculatorklassen();
        assertEquals(6, calculator.add(1, 5));
    }

    @Test
    void fourPlusFourShouldEqualEight() {
        var calculator = new Calculatorklassen();
        assertTrue(calculator.add(4,4) == 8);

    }

}