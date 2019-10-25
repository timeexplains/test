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
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import service.XService;

public class ExportAction2 extends Action{
	@Resource
	XService xService;
	Log logger = LogFactory.getLog(ExportAction2.class);
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		
		for(int i=0;i<=1000000;i++) {
			sheet.createRow(i).createCell(0).setCellValue("dfalfsajlfjsasakjflajflajflsajfalkjsaljfsaljfsaljf");
		}
		
		
		downloadFile(response, "XSSF_OPT", workbook);
		
		
		return null;
	}


	public void downloadFile(HttpServletResponse response, String fileName,Workbook workbook) throws IOException {
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
	
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request,
			ServletResponse response) throws Exception {
		return execute(mapping, form, request, response);
	}
	

}
