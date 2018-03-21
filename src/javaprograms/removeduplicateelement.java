package javaprograms;

public class removeduplicateelement {
	
public static void main(String[] args) {
	

	int a[] = {2, 3, 2, 10, 8, 5, 4};
	int arraylgth = a.length;
	//for(int i=0; i<arraylgth; i++){
		
		System.out.print("B First Position: "+a[4]+", ");
		System.out.print("B Second Position: "+a[5]+", ");
		System.out.print("B Third Position: "+a[6]);
		System.out.println(a.length);
		System.out.println();
		
	//	if(a[0]==a[1]){
			
			a[5]=a[6];
			System.out.print("A First Position: "+a[4]+", ");
			System.out.print("A Second Position: "+a[5]+", ");
			System.out.print("A Third Position: "+a[6]);
			System.out.println(a.length);
	//	}

		
		
	//}
		
		
	}
	

}
