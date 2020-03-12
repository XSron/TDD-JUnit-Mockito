package com;

import java.util.Arrays;

public class ArrayFlattener implements ArrayFlattenerService {
	@Override
	public int[] flattenArray(int[][] arr) {
		if(arr == null) return null;
		return Arrays.stream(arr).flatMapToInt(x -> Arrays.stream(x)).toArray();
	}
}
