package action;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.alibaba.fastjson.JSONObject;

import context.SpringContextHolder;
import service.XService;

public class UserAction extends Action{
	@Resource
	XService xService;
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println(mapping);
		System.out.println(form);
		System.out.println(request);
		System.out.println(response);
		

		XService s2 = (XService) SpringContextHolder.getBean("xService");
		
		System.out.println(s2.sub(2, 1));
		
		response.setHeader("Content-Type", "application/json");
		response.getWriter().println("{a:"+s2.add(2, 3)+"}");
		
		response.getWriter().println("<htm><body><div style='color:red'>this is a web application.</div.</body></html>");
		
		return null;
	}
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request,
			ServletResponse response) throws Exception {
		return execute(mapping, form, request, response);
	}
	

}
