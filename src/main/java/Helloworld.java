import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import service.XService;

public class Helloworld {
	public static void main(String[] args) {
		System.out.println("china china:"+Math.min(1, 2));
		System.out.println(System.getProperty("java.version"));
			
		 ApplicationContext ctx = new FileSystemXmlApplicationContext( "F:\\eclipse-workspace\\Test\\spring.xml ");
		 
		 XService service =  (XService) ctx.getBean("xService");
		 service.test();
		 
	}

}
