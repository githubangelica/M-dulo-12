package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreePosCondicoesDeTesteTest {
    @Before
    public void preCondicao(){
        System.out.println("Pre condicao");
    
}

@Test
public void metodo01(){
    System.out.println("metodo01");
}

@Test
public void metodo02(){
    System.out.println("metodo02");

}

@After
public void posCondicao(){
    System.out.println("pos condicao");

}

}
