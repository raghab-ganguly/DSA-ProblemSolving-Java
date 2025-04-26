//Write java program to print duplicate elements of array

import java.util.Scanner;

public class DuplicateElementFind{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the array elements: ");
		
		for(int i=0;i<arr.length;i++){
			arr[i] = scanner.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					System.out.println("Duplicate element is: "+arr[i]);
				}
			}
		}
		scanner.close();
	}
}