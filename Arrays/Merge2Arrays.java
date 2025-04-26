//Merge two arrays into single array

import java.util.Arrays;

public class Merge2Arrays{
	public static void main(String[] args){
		int[] arr1=new int[]{10,20,30};
		int[] arr2=new int[]{40,50,60};
		int[] mergedArr=new int[arr1.length+arr2.length];
		
		System.out.println("Before Merging\n===============\n"+Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
		
		for(int i=0;i<arr1.length;i++){
			mergedArr[i] = arr1[i];
		}
		for(int i = 0;i < arr2.length;i++){
			mergedArr[i+arr1.length]=arr2[i];	
		}	
		System.out.println("After Merging\n================\n"+Arrays.toString(mergedArr));
	}
}