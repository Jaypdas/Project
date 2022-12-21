package corejava;

public class MethodSample {
	
	public void test() {
		System.out.println("method 1");
		System.out.println("method 2");
		
	}
	public void test1() {
		System.out.println("method 3");
		System.out.println("method 4");
		test();
		 
	}
	
	public static void test3() {		
		System.out.println("M5");	
				
	}
	public static void main(String[] args) {
		System.out.println("welcome to selenium method");
		MethodSample s=new MethodSample(); //creation of object
		s.test();
		s.test1();
		test3(); //Static method direct call
	}

}