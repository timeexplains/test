package listen;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.ctrip.framework.apollo.ConfigService;

public class Listen1 implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("listen1");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("listen1");
	}

}
