public class ReversingArray2pointer{
	public static void main(String... args){
		System.out.println("Before Rerversing: ");
		printArray(args);
		
		reverseArr(args,0,args.length-1);
		System.out.println("After Reversing: ");
		printArray(args);
	}
	static void printArray(String[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void reverseArr(String[] arr,int start,int end){
		while(start < end){
			String temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}