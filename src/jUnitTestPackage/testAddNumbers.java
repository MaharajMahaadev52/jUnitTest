package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;


//Maharaj Mahaadev
//E20CSE085
public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.AddNumbers(100, 200);
		assertEquals(300, result);
	}

}
