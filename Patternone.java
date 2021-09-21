package arrayy_and_patterns;
import java.util.*;
public class Patternone {
	public static void main(String args[] ) {
		
		// Program to print Pyramid of height 'h'
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the height of PYRAMID :- ");
		int height=sc.nextInt();
		sc.close();
		
		int j=(height-1);
		
		for(int i=0;i <height;i++) {
			
			for(int l=0;l<j;l++) {
				System.out.print(" ");
				
			}
			System.out.print("*");
			if(i>0) {
				for(int k=1;k<=i;k++) {
					System.out.print(" ");
					System.out.print("*");
				}
				
			}
			
			j=j-1;
			System.out.print("\n");
			
			
			
		}
		
	}
	

}
