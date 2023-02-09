package or.test.javacalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lesson.javacalculator.Calculator;

public class CalculatorTest {
	private static Calculator calculator;
	
	@BeforeAll
	private static void beforeAll() {
		calculator = new Calculator();
	}
	
	//test
	
	@Test
	@DisplayName("Test sum")
	void testSum() {
		float sum = calculator.add(6, 6);
		
		assertEquals(12, sum, "Somma non possibile");
	}
	
	
	@Test
	@DisplayName("Test substract")
	void testsubtraction() {
		float subtraction = calculator.subctract(2.6f, 6.2f);
		
		assertEquals(-3.6000003f, subtraction, "Sottrazione non possibile");
	}
	
	@Test
	@DisplayName("Test division")
	void testDivision() throws Exception{
		float divide = calculator.divide(10, 5);
		assertEquals(2, divide, "non si puo dividere questo numero");
	}
	
	@Test
	@DisplayName("Test divisione per 0")
	void testDivisionException(){
		
		assertThrows(Exception.class, () -> calculator.divide(90, 0));
	}
	
	@Test
	@DisplayName("Test Moltiplicazione")
	void testMultiply() {
		float multiply = calculator.multiply(4.57f, 6.37f);
		
		assertEquals(29.1109f, multiply, "Moltiplicazione non possibile");
	}
}
