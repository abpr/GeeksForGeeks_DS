package com.gfg.www;

import java.util.Arrays;

public class ProdArray {
	public static void main(String[] args){
		int[] arr = {10, 3, 5, 6, 2};
		System.out.println(Arrays.toString(calcProdArray(arr)))	;
	}
	public static int[] calcProdArray(int[] arr){
		//without division and in O(N) time
		if(arr == null)
			return null;
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		for(int i=0; i<left.length; i++){
			left[i] = 1;
			right[i] = 1;
		}
		for(int i=1; i<arr.length; i++)
			left[i] = left[i-1] * arr[i-1];
		for(int i=left.length-2; i>=0; i--){
			System.out.println(arr[i+1]);
			right[i] = right[i+1]*arr[i+1];
		}
		for(int i=0; i<arr.length; i++)
			right[i]*= left[i];
		return right;
		//[180, 600, 360, 300, 900]
		
		//get the product of the array in one swoop
		/*int prod = 1;
		for(int i=0; i<arr.length; i++){
			prod *= arr[i];
		}
		for(int i=0; i<arr.length; i++){
			arr[i] = prod/ arr[i];
		}
		return arr;*/
	}

}
