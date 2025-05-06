/*
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
*/
/*
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
*/

import java.util.Scanner;
public class Pattern9 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no. rows: ");
		int n = scanner.nextInt();
		int x,y;
		if(n % 2 == 0){
			x = n/2;
			y = x;
		}else{
			x = (n+1)/2;
			y = x-1;
		}
		
		//for upper half
		for(int i = 0;i < x;i++){
			//space
			for(int j = 0;j < x-i-1;j++){
				System.out.print("  ");
			}
			//*
			for(int j=0;j<2*i+1;j++){
				System.out.print(" *");
			}
			//space
			for(int j = 0;j < x-i-1;j++){
				System.out.print("  ");
			}
			System.out.println();
		}
		//for lower half
		if(n % 2 != 0){
			for(int i = 0;i < y;i++){
				//space
				for(int j = 0;j < i+1;j++){
					System.out.print("  ");
				}
				//*
				for(int j=0;j<2*y - (2*i + 1);j++){
					System.out.print(" *");
				}
				//space
				for(int j = 0;j < i+1;j++){
					System.out.print("  ");
				}
				System.out.println();
			}
		}else{
			for(int i = 0;i < y;i++){
				//space
				for(int j = 0;j < i;j++){
					System.out.print("  ");
				}
				//*
				for(int j=0;j<2*y - (2*i + 1);j++){
					System.out.print(" *");
				}
				//space
				for(int j = 0;j < i;j++){
					System.out.print("  ");
				}
				System.out.println();
			}
		}
		
	}
}