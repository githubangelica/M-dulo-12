package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

    Calculadora calculo = new Calculadora();

    @Test

    public void soma(){
        assertEquals(4, calculo.calc(2, 2));
    }


    
    
}
