package test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import kata.Kata;

public class KataTest {
	@Test
	public void greetingTest() {
		assertThat(Kata.greeting("sir"), is("Hello sir!"));
	}
}
