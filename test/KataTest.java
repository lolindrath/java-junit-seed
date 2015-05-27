package test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

import org.junit.Test;

import kata.Kata;

public class KataTest {
	@Test
	public void greetingTest() {
		assertThat(Kata.greeting("sir"), is("Hello sir!"));
	}
}
