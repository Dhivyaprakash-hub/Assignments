package com.dp.assignments;

public class Greater {

	public static void main(String[] args) {
		
		int arr[]= {10,33,5,76,12,4};
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The largest number of the array is:" +max);
	}

}
