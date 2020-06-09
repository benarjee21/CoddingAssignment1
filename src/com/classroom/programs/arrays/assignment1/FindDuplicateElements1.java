package com.classroom.programs.arrays.assignment1;

public class FindDuplicateElements1 {
	
	public void printigDuplicates(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,5,5,6,6,7,2};
		FindDuplicateElements1 dups=new FindDuplicateElements1();
		System.out.println("Repeated Numbers are:");
		dups.printigDuplicates(arr);
		
	}

}
