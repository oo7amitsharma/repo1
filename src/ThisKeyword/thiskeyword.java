package ThisKeyword;

public class thiskeyword {
	
	int x, y, z;
	static int a =4;
	
	public void test(){
		
		int x =5;
		System.out.println("value of x: "+x);
		System.out.println("value of this x: "+ this.x);
	}
	
	public static void main(String args[]){
		
		thiskeyword th = new thiskeyword();
		th.test();
		
	}

}
 