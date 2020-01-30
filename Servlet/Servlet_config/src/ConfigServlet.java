import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("name");
		out.print("name is: "+name);
		
		out.close();
	}

}
