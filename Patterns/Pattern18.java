/*
E
D E
C D E
B C D E
A B C D E
*/

import java.util.Scanner;
public class Pattern12 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++){
			for(char ch=(char)('A'+(n-i-1));ch<'A'+n;ch++){
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}