package com.williansmartins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.williansmartins.controller.ValidadorDeCPF2;

public class ValidadorDeCPFTest {

	@Test
	public void cpfInvalidosTest() {
		assertEquals(false, ValidadorDeCPF2.isCPF(null));
		assertEquals(false, ValidadorDeCPF2.isCPF(""));
		assertEquals(false, ValidadorDeCPF2.isCPF("0"));
		assertEquals(false, ValidadorDeCPF2.isCPF("00000000000"));
		assertEquals(false, ValidadorDeCPF2.isCPF("11111111111"));
		assertEquals(false, ValidadorDeCPF2.isCPF("99999999999"));
		assertEquals(false, ValidadorDeCPF2.isCPF("12345687911"));
		assertEquals(false, ValidadorDeCPF2.isCPF("11488954644"));
		assertEquals(false, ValidadorDeCPF2.isCPF("32132454544"));
		assertEquals(false, ValidadorDeCPF2.isCPF("456567767657"));
		assertEquals(false, ValidadorDeCPF2.isCPF("123.456.879-11"));
		assertEquals(false, ValidadorDeCPF2.isCPF("114.889.546-44"));
		assertEquals(false, ValidadorDeCPF2.isCPF("321.324.545-44"));
		assertEquals(false, ValidadorDeCPF2.isCPF("456.567.767-57"));

		assertEquals(false, ValidadorDeCPF2.isCPF("071.721.522-98"));
		assertEquals(false, ValidadorDeCPF2.isCPF("847.781.803-72"));
		assertEquals(false, ValidadorDeCPF2.isCPF("471.382.531-09"));
		assertEquals(false, ValidadorDeCPF2.isCPF("434.896.155-73"));
		assertEquals(false, ValidadorDeCPF2.isCPF("179.947.946-37"));
		assertEquals(false, ValidadorDeCPF2.isCPF("328.179.426-20"));
		assertEquals(false, ValidadorDeCPF2.isCPF("916.326.148-04"));
		assertEquals(false, ValidadorDeCPF2.isCPF("761.859.339-69"));

		assertEquals(false, ValidadorDeCPF2.isCPF("916.326.148-**"));
		assertEquals(false, ValidadorDeCPF2.isCPF("761.859.339-##"));

	}
	
	@Test
	public void cpfValidosTest() {
		assertEquals(true, ValidadorDeCPF2.isCPF("07172152298"));
		assertEquals(true, ValidadorDeCPF2.isCPF("84778180372"));
		assertEquals(true, ValidadorDeCPF2.isCPF("47138253109"));
		assertEquals(true, ValidadorDeCPF2.isCPF("43489615573"));
		assertEquals(true, ValidadorDeCPF2.isCPF("17994794637"));
		assertEquals(true, ValidadorDeCPF2.isCPF("32817942620"));
		assertEquals(true, ValidadorDeCPF2.isCPF("91632614804"));
		assertEquals(true, ValidadorDeCPF2.isCPF("76185933969"));
	}


}