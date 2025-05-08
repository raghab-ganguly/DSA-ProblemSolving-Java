/*
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
*/
import java.util.Scanner;
public class Pattern23 {
	public static int factorial(int n){
		if(n == 0 || n == 1)return 1;
		return n*factorial(n-1);
	}
	public static int polynomialCoeff(int n,int r){
		return factorial(n)/(factorial(r) * factorial(n-r));
	}
	public static void printPascalTriangle(int n){
		for(int i=0;i<n;i++){
			//space
			for(int j=0;j<n-i;j++){
				System.out.print(" ");
			}
			//numbers
			for(int j=0;j<=i;j++){
				System.out.print(polynomialCoeff(i,j)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n=scanner.nextInt();
		
		printPascalTriangle(n);
	}
}