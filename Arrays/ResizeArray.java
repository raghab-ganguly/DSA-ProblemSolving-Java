import java.util.Arrays;

public class ResizeArray {
	public static void main(String... args){
		int[] arr={1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		System.out.println("Before Resizing:: "+arr.length);

		arr = resize(arr,arr.length * 2);
		System.out.println("After Resizing:: "+arr.length);
	}

	public static int[] resize(int[] oldArray,int capacity){
		int[] temp = new int[capacity];
		for(int i = 0;i < oldArray.length;i++){
			temp[i] = oldArray[i];
		}
		return temp;
	}
}

