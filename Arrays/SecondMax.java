import java.util.Arrays;

public class SecondMax{
	public static void main(String[] args){
		int[] arr = {13, 34, 14, 34, 33, 1};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Second Max:: "+secondMax(arr));
	}
	public static int secondMax(int[] arr){
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] > max){
				secondMax = max;
				max = arr[i];
			}else if(secondMax < arr[i] && arr[i] != max){
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
}