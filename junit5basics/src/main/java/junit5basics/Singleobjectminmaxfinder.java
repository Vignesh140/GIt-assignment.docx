package junit5basics;

import java.util.Arrays;

public class Singleobjectminmaxfinder {
	
	public int findMin(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	public int findMax(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
}


