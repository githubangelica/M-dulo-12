package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExercícioCrieUmNovoTesteTest {

    ExercicioCrieUmNovoTeste exerciciocrieumnovoteste = new ExercicioCrieUmNovoTeste();

    @Test
    public void multiplicacao(){
        assertEquals(25, exerciciocrieumnovoteste.calc(5, 5));

    }
    
}
