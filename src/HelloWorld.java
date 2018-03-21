
public class HelloWorld {
	
	private static float x;
	private char y;
//	static final int z;
static{
		System.out.println("Before main");
		
	}
	
	public static void main(String args[]){
		int a = 0;
		System.out.println(x);
		System.out.println("Hello");
		HelloWorld h =new HelloWorld();
		h.test();
		System.out.println(a);
		
	}
	public void test()
	{
		System.out.println("value of y is: " + y);
		
	}
}
