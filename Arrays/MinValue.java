public class MinValue {
	public static void main(String[] args){
		int[] arr = {10,2,5,25,-2,0};
		printArray(arr);
		System.out.println("The minimum element: "+minElement(arr));
	}
	static void printArray(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static int minElement(int[] arr){
		if(arr == null || arr.length == 0){
			throw new IllegalArgumentException("Invalid Input!!!");
		}
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
}