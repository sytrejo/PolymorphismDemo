package Widening;

public class Demo {
	
	public static void main(String[] args) {
		int x = 30;
		myMethod(x);
	}
	
	private static void myMethod(byte b) {
		System.out.println("Byte version of method");
	}
	
	private static void myMethod(short s) {
		System.out.println("int version of method");
	}

	private static void myMethod(long l) {
		System.out.println("Long version of method");
	}


}
