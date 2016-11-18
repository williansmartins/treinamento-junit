package com.williansmartins.validaCPF;

import org.junit.Assert;
import org.junit.Test;

public class TestValidaCPF {
	
	@Test
	public void testando(){
		Assert.assertEquals(new ValidaCPF().validador(4), 8);
	}
}
