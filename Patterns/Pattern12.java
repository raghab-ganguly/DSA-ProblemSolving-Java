/*
1                1
12              21
123            321
1234          4321
12345        54321
123456      654321
1234567    7654321
12345678  87654321
123456789987654321
*/
import java.util.Scanner;
public class Pattern12 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n=scanner.nextInt();
		int s=n*2-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int j=1;j<=s;j++){
				System.out.print(" ");
			}
			s-=2;
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}