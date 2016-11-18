package com.williansmartins.rules;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatadorDeData {  
    public String formata(Date data) {  
        SimpleDateFormat sdf  = new SimpleDateFormat("dd 'de' MMMM", new Locale("pt", "BR"));  
        return sdf.format(data);  
    }  
}