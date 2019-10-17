import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import op.test;
import service.XService;

public class Helloworld {
	public static void main(String[] args) {
		System.out.println("china china:"+Math.min(1, 2));
		System.out.println(System.getProperty("java.version"));
			
		 ApplicationContext ctx = new ClassPathXmlApplicationContext( "spring-context-owen.xml ");
		 
		 XService service =  (XService) ctx.getBean("xService");
		 service.test();
		 
		 
	}

}
