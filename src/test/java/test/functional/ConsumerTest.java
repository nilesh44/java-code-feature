package test.functional;

import static org.junit.Assert.assertEquals;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;

import org.junit.Test;

public class ConsumerTest {

	// consumer interface accept argument but return void.
	// commonly used use case is forEach method .
	@Test
	public void consumerTest() {
		Consumer<Integer> consumer = num -> {
			assertEquals("2", num.toString());
		};
		consumer.accept(2);
	}

	@Test
	public void biConsumerInterfaceTest() {
		// name describe that it will accept two argument
		BiConsumer<Integer, Integer> biconsumer = (num1, num2) -> {
			assertEquals("2", num1.toString());
			assertEquals("7", num2.toString());
		};

		biconsumer.accept(2, 7);

	}

	@Test
	public void doubleConsumerTest() {
		// name describe that it will accept only one primitive double value
		DoubleConsumer doubleConsumer = doubleValue -> {
			assertEquals("7.0", String.valueOf(doubleValue));
		};

		doubleConsumer.accept(7);
	}

	@Test
	public void intConsumerTest() {
		// name describe that it will accept only one primitive int value
		IntConsumer intConsumer = intValue -> {
			assertEquals("7", String.valueOf(intValue));
		};

		intConsumer.accept(7);
	}

	@Test
	public void objDoubleConsumerTest() {
		// name describe that it will accept object type which we passed with one
		// primitive double value
		ObjDoubleConsumer<String> objDoubleConsumer = (string, doubleValue) -> {
			assertEquals("hight : 7.0", string+ String.valueOf(doubleValue));
		};

		objDoubleConsumer.accept("hight : ", 7);
	}

	@Test
	public void objIntConsumerTest() {
		// name describe that it will accept object type which we passed with one
		// primitive int value
		ObjIntConsumer<String> objIntConsumer = (string, intValue) -> {
			assertEquals("hight : 7", string+ String.valueOf(intValue));
		};

		objIntConsumer.accept("hight : ", 7);
	}

}
