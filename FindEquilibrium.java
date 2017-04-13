package com.gfg.www;

public class FindEquilibrium {
	
	public static void findEquilibriumPoint(int[] arr){
		if(arr == null)
			return;
		int sum = 0;
		for(int i=0; i<arr.length; i++)
			sum = sum + arr[i];
		int currSum = 0;
		//System.out.println(sum);
		for(int i=0; i<arr.length; i++){
			

			sum-=arr[i];
			if(sum == currSum && i!= 0)
				System.out.println(i);
			currSum+=arr[i];
		}
		
		
			
		}
	
	public static void main(String[] args){
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		findEquilibriumPoint(arr);
	}

}
