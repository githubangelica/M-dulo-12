package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidacaoVerdadeiroFalsoTest {
    @Test
    public void verdadeiro(){
        boolean campoEstaPresente = true;
        assertTrue(campoEstaPresente);
    }

    @Test
    public void falso(){
        boolean campoEstaPresente = false;
        assertFalse(campoEstaPresente);
    }
    
}
