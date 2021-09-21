package arrayy_and_patterns;

public class replacenumber {
	
	 // Given array I/p- [1,2,4,6,8,12,76,23,64]  n = 76 o/p= [1,2,4,6,8,12,0,23,64]
	
	public static void main(String args[]) {
		
		int[] input= {1,2,4,6,8,12,76,23,64};
		int[] output= new int[9];
		int n=76;
		System.out.println("The  INPUT array :");
		
		for (int i=0;i<input.length;i++) {
			if(i==0) {
				System.out.format("{"+"%d"+",",(input[i]));
			}
			else if(i==(input.length-1)) {
				System.out.format("%d"+"}",(input[i]));
			}
			else {
				System.out.format("%d"+",",(input[i]));
			}
		}
			
		for(int i=0;i<input.length;i++) {
			
			output[i]=input[i];
			if(input[i]==n) {
				output[i]=0;
				
				
			}
		}
		
		System.out.println("\nThe new OUPUT array :");
		for (int j=0;j<output.length;j++) {
			if(j==0) {
				System.out.format("{"+"%d"+",",(output[j]));
			}
			else if(j==(output.length-1)) {
				System.out.format("%d"+"}",(output[j]));
			}
			else {
				System.out.format("%d"+",",(output[j]));
			}
		}
			
	
		
	}

}
