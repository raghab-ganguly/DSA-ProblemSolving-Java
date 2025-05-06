/*

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/
import java.util.Scanner;
public class Pattern10 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no. rows(ODD NO): ");
		int n = scanner.nextInt();
		
		int x=(n+1)/2;
		int y=x-1;
		
		for(int i=0;i<x;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<y;i++){
			for(int j=0;j<y-i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}