package javaprograms;

public class sortinganarray {
	
	public static void main(String args[]){
	
	int a[] = {2, 4, 1, 10, 8, 5, 4};
	int arraylgth = a.length;
	int round, i, temp;
	for(round=1; round <= arraylgth-1; round++){
		for(i=0; i<arraylgth-round; i++){
			
			if(a[i]>=a[i+1]){
				
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] =temp;
				
			}
			
		}
		
		
	}
//	for(int j : a){
//	System.out.println(a[j]);
//	}
	for(int j=0; j<arraylgth; j++){
		
		System.out.print(a[j]);
		System.out.print(", ");
	
	}
	
	
	}

}
