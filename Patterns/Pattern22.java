/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/
import java.util.Scanner;
public class Pattern22 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the last highest no: ");
		int n=scanner.nextInt();
		
		for(int i=0;i<2*n-1;i++){
			for(int j=0;j<2*n-1;j++){
				int top=i;
				int left=j;
				int right=(2*n-2)-j;
				int down=(2*n-2)-i;
				System.out.print(n-Math.min(Math.min(top,down),Math.min(left,right))+" ");
			}
			System.out.println();
		}
	}
}