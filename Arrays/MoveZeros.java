import java.util.Arrays;

public class MoveZeros{
	public static void main(String[] args){
		int[] arr = new int[]{12, -2, 0, 3, 5, 0, 0, 1, 35};
		
		System.out.println(Arrays.toString(arr));
		
		moveZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void moveZeros(int[] arr){
		int j = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != 0 && arr[j] == 0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j] != 0){
				j++;
			}
		}
	}
}