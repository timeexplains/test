package service;

public class XService {

	public String test() {
		System.out.println("xService.test");
		return "test";
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int multiply(int a,int b) {
		return a*b;
	}
	
	public int divide(int a,int b) {
		return a/b;
	}
}
