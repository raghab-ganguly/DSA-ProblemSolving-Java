public class RemoveEvenIntegersFromArray{
	
	static void printArray(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static int[] removeEven(int[] arr){
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] % 2 != 0 ){
				count++;
			}
		}
		int[] oddArray = new int[count];
		int index = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] % 2 != 0){
				oddArray[index] = arr[i];
				index++;
			}
		}
		return oddArray;
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		printArray(arr);
		printArray(removeEven(arr));
	}
}