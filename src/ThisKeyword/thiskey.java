package ThisKeyword;

public class thiskey extends thiskeyword {

	static long a=5;
	
	public static void main(String args[]){
		
		System.out.println(a);
		thiskey th =new thiskey();
		th.test();
		
	}
	
	public void test(){
		System.out.println(super.a);
		
		
		
	}
}
