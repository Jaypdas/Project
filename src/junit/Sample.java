package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample {

	@Before
	public void setUp() throws Exception {
		System.out.println("Get");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Ready");
	}

	@Test
	public void test() {
		System.out.println("Set");		
		
	}
	@Test
	public void Ram() {
		System.out.println("ram");
	}

}
