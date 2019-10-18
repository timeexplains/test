package action;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bean.Human;
import context.SpringContextHolder;
import service.XService;

public class UserAction extends Action{
	@Resource
	XService xService;
	Log logger = LogFactory.getLog(UserAction.class);
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		logger.debug("enter 1:");
		
		System.out.println(mapping);
		System.out.println(form);
		System.out.println(request);
		System.out.println(response);
		

		XService s2 = (XService) SpringContextHolder.getBean("xService");
		
		s2.test();
		
		System.out.println(s2.sub(2, 1));
		
//		logger.debug((Human)SpringContextHolder.getBean("human"));
		
		logger.debug(new Human());
		
		response.setHeader("Content-Type", "application/json");
		
		System.out.println(s2.add(3, 4));
		
//		Thread.sleep(30000);
		
		response.getWriter().println("<htm><body><div style='color:red'>this is a web application.</div.</body></html>");
		
		logger.debug("finished!");
		
		
		return null;
	}
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request,
			ServletResponse response) throws Exception {
		return execute(mapping, form, request, response);
	}
	

}
