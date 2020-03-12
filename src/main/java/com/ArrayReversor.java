package com;

public class ArrayReversor {
	public int[] reverseArray(int[] arr) {
		if(arr == null) return null;
		int[] newArr = new int[arr.length];
		int count = 0;
		for(int i=arr.length-1; i>=0; i--) {
			newArr[count] = arr[i];
			count++;
		}
		return newArr;
	}
}
