package test.functional;

import static org.junit.Assert.assertEquals;

import java.util.function.Function;

import org.junit.Test;

public class FunctionTest {

	//function , we can pass one argument and accept on return type which we declared
	@Test
	public void supplierTest() {
		
		Function<String,Boolean> function= (string)->{
			if(string.equals("yes")) {
				return true;
			}
			return false;
		};
		
		assertEquals(true, function.apply("yes"));
	}
	@Test
	public void supplierTestStringToIntConversion() {
		
		Function<Integer,String> function= (string)->{
			return String.valueOf(string);
		};
		
		assertEquals("500", function.apply(500));
	}
	
	    //Similarly we have 
		//IntFunction  return primitive int value.
		//LongFunction return primitive long value.
		//DoubleFunction return primitive double value
}
