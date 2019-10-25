package action;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import app.Helloworld;
import context.SpringContextHolder;
import service.XService;

public class UserAction extends Action{
	@Resource
	XService xService;
	Log logger = LogFactory.getLog(UserAction.class);
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		if( request.getParameter("method").equals("logtest")) {
			Helloworld.main(null);
			return null;
		}

		logger.debug("enter 1:");
		
		System.out.println(mapping);
		System.out.println(form);
		System.out.println(request);
		System.out.println(response);
		

		XService s2 = (XService) SpringContextHolder.getBean("xService");
		
		s2.test();
		
		System.out.println(s2.sub(2, 1));
		
//		logger.debug((Human)SpringContextHolder.getBean("human"));
		
//		logger.debug(new Human());
		
		
		System.out.println(s2.add(3, 4));
		
//		Thread.sleep(30000);
		
		OutputHtml(response);
		
		logger.debug("finished!");
		
		
		return null;
	}


	public void downloadFile(HttpServletResponse response, String fileName,XSSFWorkbook workbook) throws IOException {
		MessageFormat format = new MessageFormat(new String(fileName.getBytes("gb2312"),"iso8859-1")
		+"_{0,date,yyyyMMddhhmm}.xlsx");
		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		// 设置下载的文件名称
		//application/vnd.openxmlformats-oficedocument.spreadsheetml.sheet
		response.setHeader("Content-Disposition", "attachment; filename=\"" + format.format(new Object[] { new Date() }) + "\" ");
		response.setHeader("Content-Transfer-Encoding","binary");
		response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
		response.setHeader("Pragma", "public");
		response.setCharacterEncoding("UTF-8");
		ServletOutputStream os = response.getOutputStream();
		workbook.write(os);
		os.flush();
		os.close();
	}
	
	private void OutputHtml(HttpServletResponse response) throws IOException {
		response.setHeader("Content-Type", "application/json");
		response.getWriter().println("<htm><body><div style='color:red'>this is a web application.</div.</body></html>");
	}
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request,
			ServletResponse response) throws Exception {
		return execute(mapping, form, request, response);
	}
	

}
