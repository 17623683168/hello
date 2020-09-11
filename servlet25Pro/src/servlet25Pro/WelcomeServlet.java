package servlet25Pro;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("init----");
		String value=super.getInitParameter("servletParam");
		System.out.println("当前servlet的值value："+value);
		
		ServletContext servletContext =super.getServletContext();
		String globlevalue=servletContext.getInitParameter("globleParam");
		System.out.println("当前web容器参数globlevalue的值："+globlevalue);
		
	}
	@Override
	public void destroy() {
		System.out.println("destory----");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		System.out.println("doGet");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		System.out.println("doPost");
	}
	
}
