package listen;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listen2 implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("listen2");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("listen2");
	}

}
