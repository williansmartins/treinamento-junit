package com.williansmartins;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InicializacaoFinalizacao {
	private String stringLocal;

    @Before
    public void inicializaLocal() {
        System.out.println("Inicializou.");
        this.stringLocal = "inicializada";
    }

    @Test
    public void testInicializadaLocal1() {
        Assert.assertEquals("A String deveria estar inicializada.", "inicializada", this.stringLocal);
    }
    
    @Test
    public void testInicializadaLocal2() {
        Assert.assertEquals("A String deveria estar inicializada.", "inicializada", this.stringLocal);
    }
    
    @After
    public void setaNull() {
        System.out.println("Setou nulo.");
        this.stringLocal = null;
    }
}
