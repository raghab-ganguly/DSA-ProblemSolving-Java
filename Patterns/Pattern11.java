/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
*/

import java.util.Scanner;
public class Pattern11 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no. rows: ");
		int n = scanner.nextInt();
		
		for(int i=0;i<n;i++){
			int start;
			if(i % 2 == 0)start = 1;
			else start = 0;
			for(int j=0;j<=i;j++){
				System.out.print(start+" ");
				start = 1 - start;
			}
			System.out.println();
		}
	}
}