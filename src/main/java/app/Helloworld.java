package app;
import java.sql.ResultSet;

import com.ibatis.common.logging.Log;
import com.ibatis.common.logging.LogFactory;


public class Helloworld {

	static {
		try {
//			String filePath = "file:D:\\localRepository\\mvn\\org\\apache\\ibatis\\ibatis-sqlmap\\2.3.4\\ibatis-sqlmap-2.3.4.jar";
//			URL url = new URL(filePath);
//			URLClassLoader loader = new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());
//			loader.loadClass("com.ibatis.common.logging.Log");
//			loader.loadClass("com.ibatis.common.logging.LogFactory");
			Log log = LogFactory.getLog(ResultSet.class);
			int i = 0;
			StringBuffer sb = new StringBuffer();
			while( i++ <= 1) {
				String s = "[1296591379206179, CPYCGL461530001, 46U果绿成品, CPYCGL461530001, 46Uglcp, 0, 0, 0, 0, 0, 0, 卷, BH湖北成品备货库, 129649117911638, 0, 129649116929141, GG15GL4630, 0, 0, 0, 0, 0, 0, 0, 0, null, 1296591379206180, DYC文具箱（16号大）/15MM文具胶芯/8/50, HBGL461530001_0, 12964911695647, 0, null, 0, 0, 0, 0, 0, 0, HBGL461530001]";
				sb.append(s);
			}
			log.debug(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Log log = LogFactory.getLog(ResultSet.class);
		int i = 0;
		StringBuffer sb = new StringBuffer();
		while( i++ <= 1) {
			String s = "[1296591379206179, CPYCGL461530001, 46U果绿成品, CPYCGL461530001, 46Uglcp, 0, 0, 0, 0, 0, 0, 卷, BH湖北成品备货库, 129649117911638, 0, 129649116929141, GG15GL4630, 0, 0, 0, 0, 0, 0, 0, 0, null, 1296591379206180, DYC文具箱（16号大）/15MM文具胶芯/8/50, HBGL461530001_0, 12964911695647, 0, null, 0, 0, 0, 0, 0, 0, HBGL461530001]";
			sb.append(s);
		}
		log.debug(sb.toString());
	}

}
