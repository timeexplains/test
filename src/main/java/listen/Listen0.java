package listen;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

import bean.BeansManager;

public class Listen0 extends ContextLoaderListener  {
	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("listen0");
		
		System.out.println(event);
		
		super.contextInitialized(event);
		
		Config config  = ConfigService.getAppConfig();
		
		BeansManager.setApolloConfig(config);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("listen0");
		super.contextDestroyed(event);
	}

}
