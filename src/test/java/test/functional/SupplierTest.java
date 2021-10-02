package test.functional;

import static org.junit.Assert.assertEquals;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import org.junit.Test;

public class SupplierTest {
//supplier only return decleared return type .
	//supplier doesnot accept any argument
	@Test
	public void supplierTest() {
		Supplier<String> supplier= ()->{
			return "world";
		};
		
		assertEquals("world", supplier.get());
	}
	
	@Test
	public void booleanSupplierTest() {
		BooleanSupplier booleanSupplier= ()->{
			return true;
		};
		
		assertEquals(true, booleanSupplier.getAsBoolean());
	}
	
	//Similarly we have 
	//IntSupplier  return primitive int value.
	//LongSupplier return primitive long value.
	//DoubleSupplier return primitive double value.
}
