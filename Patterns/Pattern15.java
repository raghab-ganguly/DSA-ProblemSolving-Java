/*
A B C D E
A B C D
A B C
A B
A
*/
import java.util.Scanner;
public class Pattern12 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++){
			for(char j='A';j<='A'+n-1-i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}