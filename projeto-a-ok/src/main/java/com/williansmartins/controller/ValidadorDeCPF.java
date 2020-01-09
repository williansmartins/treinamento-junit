package com.williansmartins.controller;

public class ValidadorDeCPF {
	/*
	     Fonte de Pesquisa dev midia https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
	*/
	
	public static boolean isCPF(String CPF) {
		
		int peso = 10, num, soma = 0, divisao, digitoVerificador10, digitoVerificador11;
		
		//primeiro digito verificador;
		for(int i =0; i < 9; i++) {
			num = (int) (CPF.charAt(i) - 48);
			soma = soma +  (num * peso);
			peso = peso - 1;
		}
		divisao = 11 - (soma % 11);
		
		if(divisao > 9) {
			digitoVerificador10 = 0;
		}
		else {
			digitoVerificador10 = (char)(divisao + 48);
		}
		
		//segundo digito verificador
		
		soma = 0;
		peso = 11;
		for(int i = 0; i < 10; i++) {
			num = (int)(CPF.charAt(i) - 48);
			soma = soma + (num * peso);
			peso = peso -1;
		}
		
		divisao = 11 - (soma % 11);
		if(divisao == 10 || divisao == 11) {
			digitoVerificador11 = 0;
		}
		else {
			digitoVerificador11 = (char)(divisao + 48);
		}

		if(digitoVerificador10 == CPF.charAt(9) && digitoVerificador11 == CPF.charAt(10)) {
			return true;
		}else {
			return false;
		}

	}

}