/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/
import java.util.Scanner;
/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/

public class Pattern7 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no. of rows u want to print: ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			//For Space
			for(int j=1;j<=n-i;j++){
				System.out.print("  ");
			}
			//For *
			for(int j=1;j<=i*2-1;j++){
				System.out.print("* ");
			}
			//For Space
			for(int j=1;j<=n-i;j++){
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}