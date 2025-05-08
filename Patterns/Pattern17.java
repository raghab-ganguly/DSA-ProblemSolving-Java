/*
        A
      A B A
    A B C B A
  A B C D C B A
*/

import java.util.Scanner;
public class Pattern12 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n=scanner.nextInt();

		for(int i=0;i<n;i++){
			//space
			for(int j=0;j<n-i;j++){
				System.out.print("  ");
			}
			char ch;
			//alphabets
			for(ch='A';ch<='A'+i;ch++){
				System.out.print(ch+" ");
			}
			ch-=1;
			while(ch>'A'){
					ch--;
					System.out.print(ch+" ");
			}
			//space
			for(int j=0;j<n-i;j++){
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}