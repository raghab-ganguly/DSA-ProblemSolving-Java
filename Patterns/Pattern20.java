/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/
import java.util.Scanner;
public class Pattern20 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows(odd no): ");
		int n=scanner.nextInt();
		
		int x=(n+1)/2;
		int y=n/2;
		
		for(int i=0;i<x;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			for(int j=0;j<x*2-2*(i+1);j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<y;i++){
			for(int j=0;j<y-i;j++){
				System.out.print("*");
			}
			for(int j=0;j<2*(i+1);j++){
				System.out.print(" ");
			}
			for(int j=0;j<y-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}