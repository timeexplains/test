package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XService {

	Logger logger =  LoggerFactory.getLogger(XService.class);
	
	public String test() {
		System.out.println("xService.test");
		logger.debug("test method");
		return "test";
	}
	
	public int add(int a,int b) {
		logger.debug("{} add {} ", a,b);
		
		return a+b;
	}
	
	public int sub(int a,int b) {
		logger.debug("{} sub {} ",a,b);
		return a-b;
	}
	
	public int multiply(int a,int b) {
		logger.debug("{} multiply {}");
		return a*b;
	}
	
	public int divide(int a,int b) {
		logger.debug("divided");
		return a/b;
	}
}
