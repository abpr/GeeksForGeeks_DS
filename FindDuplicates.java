package com.gfg.www;

import java.util.Arrays;

public class FindDuplicates {
	
	
	
	public static void findDuplicates(int[] arr){
		//find duplicates in O(N) time and O(1) space
		if(arr == null)
			return;
		if(arr.length == 1)
			return;
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			System.out.println(Arrays.toString(arr));
			if(arr[Math.abs(arr[i])]>=0){
				arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
			}
			else{
				System.out.println(Math.abs(arr[i]));
			}
		}
		/*for(int i=0; i<arr.length; i++){
			//do one pass and find the max array
			if(arr[i] > max)
				max = arr[i];
		}
		int[] arr2 = new int[max+1];
		for(int i=0; i<arr.length; i++){
			if(arr2[arr[i]] == 0)
				arr2[arr[i]] = 1;
			else if(arr2[arr[i]] != 0)
				arr2[arr[i]] = arr2[arr[i]]+1;
		}
		for(int i=0; i<arr2.length; i++){
			if(arr2[i] == 2)
				System.out.println(i);
		}*/
		
		
	}

	public static void main(String[] args){
		int[] a = {1, 2, 3,6,6,1,3,4};
		findDuplicates(a);
	}
}
