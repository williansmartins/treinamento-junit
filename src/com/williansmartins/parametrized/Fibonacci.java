package com.williansmartins.parametrized;


public class Fibonacci {
    public static int compute(int n) {
        int result = 0;

        if (n <= 1) { 
            result = n; 
        } else { 
            result = compute(n - 1) + compute(n - 2); 
        }

        return result;
    }
    
    public static void main(String[] args) {
    	System.out.println(compute(4));
	}
}