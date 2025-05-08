/*
A
AB
ABC
ABCD
ABCDE
*/

import java.util.Scanner;
public class Pattern14 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++){
			for(char j='A';j<='A'+i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}