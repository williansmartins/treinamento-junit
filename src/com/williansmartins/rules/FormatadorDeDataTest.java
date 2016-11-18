package com.williansmartins.rules;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Locale;

import org.junit.Rule;
import org.junit.Test;

public class FormatadorDeDataTest {  
  
    @Rule  
    public LocaleRule locale = new LocaleRule(new Locale("en", "US"));  
  
    @Test  
    public void deveFormatarDataParaRelatorio() {  
  
        FormatadorDeData formatador = new FormatadorDeData();  
        String dataFormatada = formatador.formata(new Date("07/08/1982"));  
  
        assertEquals("08 de Julho", dataFormatada);  
    }  
  
    // outros métodos de teste  
} 