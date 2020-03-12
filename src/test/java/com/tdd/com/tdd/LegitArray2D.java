package com.tdd.com.tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ArrayFlattener;

public class LegitArray2D {
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
		int[][] arrayInput = {{1,3}, {0}, {4,5,9}};
		int[] actuals = arrayFlatter.flattenArray(arrayInput);
		int[] expected = {1,3,0,4,5,9};
		assertArrayEquals(expected, actuals);
	}

}
