/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
import java.util.Scanner;
public class Pattern13 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n=scanner.nextInt();
		
		int count=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(count+" ");
				count+=1;
			}
			System.out.println();
		}
	}
}