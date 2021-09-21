package arrayy_and_patterns;

public class missingnumber {
	
	// Program to find the missing number from an array
	
	public static void main(String args[]) {
		
		int[] missarr= {12,2,3,6,4,7,8,9,15,1,13,14,11};
		int[] orginal= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int flag=1;
		
		for(int i=0;i<orginal.length;i++) {
			for(int j=0;j<missarr.length;j++) {
				if(orginal[i]==missarr[j]) {
					flag=1;
					break;
				}
				else {
					flag=0;
					
				}
			}	
			if(flag==0) {
				System.out.format("\nThe numner "+"%d "+"is not present ",orginal[i]);
			}
			
			
		}
		
	}

}
