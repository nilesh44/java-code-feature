package test.functional;

import static org.junit.Assert.assertEquals;

import java.util.function.BinaryOperator;

import org.junit.Test;

import test.Employee;

public class BinaryOperatorTest {
	
	        //type of argument is same as return type 
			//two argument is acxceptable
			
	@Test
	public void testAsStringReturnType() {
		BinaryOperator<String> binaryOperator=(t1,t2)->{
			return t1+t2;
		};
		assertEquals("hello world", binaryOperator.apply("hello ", "world"));
		
	}
	
	@Test
	public void testAsEmployeeType() {
		BinaryOperator<Employee> binaryOperator=(e1,e2)->{
			if(e1.getSalary().intValue()>e2.getSalary().intValue()) {
				return e1;
			}
			return e2;
		};
		
		Employee e1= new Employee("1","A1","1234567899",new Double(1000));
		Employee e2= new Employee("2","B2","1234567898",new Double(5000));
		assertEquals(e2, binaryOperator.apply(e1, e2));
	}

}
