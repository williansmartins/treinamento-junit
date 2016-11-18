package com.williansmartins;

import org.junit.Ignore;
import org.junit.Test;

public class TestIgnoring {
	
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void test1() {
	    System.out.println("Teste1");
	}
	
	@Test
	public void test2() {
	    System.out.println("Teste2");
	}
}
