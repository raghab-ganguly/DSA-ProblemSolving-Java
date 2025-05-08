/*
* * * *
*     *
*     *
* * * *
*/
import java.util.Scanner;
public class Pattern21 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the square: ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			if(i==0 || i==n-1){
				for(int j=0;j<n;j++){
					System.out.print("* ");
				}
				System.out.println();
			}else{
				System.out.print("*");
				//space
				for(int j=0;j<n-2;j++){
					System.out.print("  ");
				}
				System.out.println(" *");
			}
		}
	}
}