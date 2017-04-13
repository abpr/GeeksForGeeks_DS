package com.gfg.www;

import java.util.Arrays;

public class SegregateOddsAndEvens {
	
	public static void main(String[] args){
		int arr[] = {12, 34, 45, 9, 8, 90, 3};
		System.out.println(Arrays.toString(segregateOddsEvens(arr)));
	}
	public static int[] segregateOddsEvens(int[] arr){
		if(arr == null)
			return null;
		int l=0, r=arr.length-1;
		while(l<r){
			if((arr[l] %2) != 0 && (arr[r]%2==0)){
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
			if((arr[l]%2 == 0))
				l++;
			if(arr[r]%2 != 0)
				r--;
		}
		return arr;
	}

}
