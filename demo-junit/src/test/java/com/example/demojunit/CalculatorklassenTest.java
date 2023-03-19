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

    @Test
    void fiveMinusOneShouldEqualFour() {
        var calculator = new Calculatorklassen();
        assertEquals(4, calculator.sub(5, 1));
    }

    @Test
    void sixDivideTheeShouldEqualTwo() {
        var calculator = new Calculatorklassen();
        assertEquals(2, calculator.div(6, 3));
    }

    @Test
    void fourMultiplyTwoShouldEqualEight() {
        var calculator = new Calculatorklassen();
        assertEquals(8, calculator.mul(4, 2));
    }

    @Test
    void twoMultiplyTwoShouldEqualFour() {
        var calculator = new Calculatorklassen();
        assertTrue(calculator.mul(2, 2) == 4);
    }
    }