package com.dp.assignments;

public class Lesser {

	public static void main(String[] args) {
		int arr[]= {10,33,5,76,12,4};
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The smallest number of the array is:" +min);

	}

}
