package junit5basics;

import java.util.Arrays;

public class Minmaxfinder {

	public int[] findMinMax(int[] arr) {
		
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int[] arr1 = new int[2];
		arr1[0]=arr[0];
		arr1[1]=arr[arr.length-1];
		return arr1;
	}
		
		
	}


