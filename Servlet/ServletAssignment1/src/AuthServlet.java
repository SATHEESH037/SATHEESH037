
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

//@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, String> check = new HashMap<String, String>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		check.put("satheesh", "1234");
		check.put("Reddy", "5678");
		check.put("lohith", "9123");
		check.put("siva", "1201");
		String user = request.getParameter("name");
		String pass = request.getParameter("pass");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		int count = 0;

		Iterator<Map.Entry<String, String>> iter = check.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String, String> entry = iter.next();
			if (user.equals(entry.getKey()) && pass.equals(entry.getValue())) {
				
				count++;
			}
		}
		if (count > 0) {
			writer.print("<p style=\"color:red; font-size:20px;\">Name/Password Match</p>");
		} else {
			writer.print("<p style=\"color:red; font-size:20px;\">Name/Password Does Not Match</p>");
		}
		// doGet(request, response);
	}

}
