package com.example.demojunit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



public class validatorTests {

    Validator validator = new Validator();

    @Test
    void shouldReturnTrueIfAdult() {
        boolean result = validator.isAllowedToEnterLiquorStore(30,false,false,false);

            Assertions.assertTrue(result);
    }
}
