package test.functional;

import static org.junit.Assert.assertEquals;

import java.util.function.UnaryOperator;

import org.junit.Test;

public class UnaryOperatorTest {
	
	 //type of argument is same as return type 
	//only argument is acxceptable
	@Test
	public void testAsStringReturnType() {
		UnaryOperator<String> binaryOperator=(t1)->{
			return t1+"world";
		};
		assertEquals("hello world", binaryOperator.apply("hello "));
		
	}
}
