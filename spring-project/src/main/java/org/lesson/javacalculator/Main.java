package org.lesson.javacalculator;

public class Main {
	public static void main(String[] args) throws Exception {

		Calculator calc = new Calculator();
		
		System.out.println(calc.add(6, 6));
		System.out.println(calc.subctract(2.6f, 6.2f));
		// Divisione per 0
		System.out.println(calc.divide(10, 2));
		//System.out.println(calc.divide(10, 0)); se divido per 0 stoppa e da il messaggio del tester
		System.out.println(calc.multiply(10, 10));
	}
}
