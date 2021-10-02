package test.functional;

import static org.junit.Assert.assertTrue;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import org.junit.Test;

public class PredicateTest {
	//predicate accept one argument and return boolean
	@Test
	public void predicateTest() {
		Predicate<String> predicate= string->{
		if(string.equals("yes")) {
			return true;
		}
		return false;
		};
		
		assertTrue(predicate.test("yes"));
	}

	@Test
	public void biPredicateTest() {
		BiPredicate<String,Integer> biPredicate= (string,integer)->{
		if(string.equals("yes")&& integer.equals(1)) {
			return true;
		}
		return false;
		};
		
		assertTrue(biPredicate.test("yes",1));
	}
}
