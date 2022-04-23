package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

//Maharaj Mahaadev
//E20CSE085
public class jUnitAddStrings {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.AddStrings("100", "200");
		assertEquals("100200", result);
	}

}
