package com.gfg.www;

public class LargestDiffIfRightElementIsBigger {
	
	public static void main(String[] args){
		int[] arr = {1, 2, 90, 10, 110};
		System.out.println(getBiggestDifference(arr));
	}
	
	public static int getBiggestDifference(int[] arr){
		//return the difference with the 2 nos
		//in which the right element must be bigger than the left element
		if(arr == null)
			return 0;
		int minNum = arr[0], maxDiff = Integer.MIN_VALUE;
		for(int i=1; i<arr.length; i++){
			if(arr[i]<minNum)
				minNum = arr[i];
			else{
				//get the diff
				int diff = arr[i] - minNum;
				if(diff > maxDiff)
					maxDiff = diff;
			}
		}
		return maxDiff;
	}

}
