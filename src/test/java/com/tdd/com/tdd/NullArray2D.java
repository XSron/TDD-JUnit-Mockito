package com.tdd.com.tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ArrayFlattener;

public class NullArray2D {
	private ArrayFlattener arrayFlatter;
	@Before
	public void setUp() throws Exception {
		arrayFlatter = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		arrayFlatter = null;
	}

	@Test
	public void test() {
		int[][] arrayInput = null;
		int[] actuals = arrayFlatter.flattenArray(arrayInput);
		int[] expected = null;
		assertArrayEquals(expected, actuals);
	}

}
