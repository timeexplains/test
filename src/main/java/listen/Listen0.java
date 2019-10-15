package listen;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

public class Listen0 extends ContextLoaderListener  {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("listen0");
//		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("spring-context-owen.xml");
		
//		XService xService = (XService) context.getBean("xService");
		
//		System.out.println("add function called"+xService.add(1, 2));
		
		System.out.println(event);
		
		super.contextInitialized(event);
		
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("listen0");
		super.contextDestroyed(event);
	}

}
