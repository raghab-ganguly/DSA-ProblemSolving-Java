/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
import java.util.Scanner;
public class Pattern19 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows(Even no): ");
		int n=scanner.nextInt();
		//outer loop for first half
		for(int i=0;i<n/2;i++){
			//*
			for(int j=0;j<n/2-i;j++){
				System.out.print("*");
			}
			//space
			for(int j=2*i;j>=1;j--){
				System.out.print(" ");
			}
			//*
			for(int j=0;j<n/2-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//outer loop for second half
		for(int i=0;i<n/2;i++){
			//*
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			//space
			for(int j=0;j<(n-2)-2*i;j++){
				System.out.print(" ");
			}
			//*
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}