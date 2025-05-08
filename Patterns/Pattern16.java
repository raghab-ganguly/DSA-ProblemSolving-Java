/*
A
B B
C C C
D D D D
E E E E E
*/

import java.util.Scanner;
public class Pattern12 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n=scanner.nextInt();
		char ch='A';
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}