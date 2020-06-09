//1)Write a Java Program to find duplicate elements in given Array?
//
//Input:  1, 2, 5, 5, 6, 6, 7, 2
//
//Output:  2, 5, 6

package com.classroom.programs.arrays.assignment1;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
	
	public Set<Integer> duplicateIntegers(int[] arr){
		Set<Integer> noDuplicates= new HashSet<Integer>();
		Set<Integer> duplicates= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			if(noDuplicates.add(element)==false) {
				duplicates.add(element);
			}
		}
		return duplicates;
	}
	
	public static void main(String args[]) {
		int[] arr= {1,2,5,5,6,6,7,2};
		FindDuplicateElements dupli= new FindDuplicateElements();
		Set<Integer> result=dupli.duplicateIntegers(arr);
		for(Integer x:result) {
			System.out.println(x);
		}
	}

}
