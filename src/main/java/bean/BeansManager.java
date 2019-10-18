package bean;

import com.ctrip.framework.apollo.Config;

public class BeansManager {
	public static Config config = null;
	
	public static void setApolloConfig(Config config) {
		BeansManager.config = config;
	}
	
	
}
