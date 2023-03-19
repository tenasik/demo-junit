package com.example.demojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Calculatorklassen {

    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    public int sub(int numberA, int numberB) {
        return numberA - numberB;
    }

    public int div(int numberA, int numberB) {
        return numberA / numberB;
    }

    public int mul(int numberA, int numberB) {
        return numberA * numberB;
    }
}
