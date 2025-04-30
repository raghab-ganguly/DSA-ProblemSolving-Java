import java.util.Arrays;

public class FindMissingEelementFromNaturalNumbers {
	public static void main(String... args) {
		int[] arr = {1, 2, 3, 8, 5, 7, 6};
		System.out.println(Arrays.toString(arr));
		
		int missing = findMissing(arr);
		System.out.println("Missing Element:: "+missing);
	}
	public static int findMissing(int[] arr){
		int n = arr.length+1;
		int sum = n * (n+1) / 2;
		int temp = 0;
		for(int num : arr){
			temp += num;
		}
		return (sum-temp);
	}
}