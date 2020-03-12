package com.tdd.com.tdd;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ArrayFlattenerService;
import com.ArrayReversor;

public class MockNullArrayReversor {
	private ArrayReversor arrayReversor;
	private ArrayFlattenerService flattenerService;
	@Before
	public void setUp() throws Exception {
		arrayReversor = new ArrayReversor();
		flattenerService = mock(ArrayFlattenerService.class);
	}

	@After
	public void tearDown() throws Exception {
		arrayReversor = null;
		flattenerService = null;
	}

	@Test
	public void test() {
	    int[][] arrayInput = null;
		when(flattenerService.flattenArray(arrayInput)).thenReturn(null);
		int[] expecteds = null;
		int[] actuals = arrayReversor.reverseArray(flattenerService.flattenArray(arrayInput));
		assertArrayEquals(expecteds, actuals);
		verify(flattenerService).flattenArray(arrayInput);
	}
}
