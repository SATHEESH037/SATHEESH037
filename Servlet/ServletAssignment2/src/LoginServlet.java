import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String User = request.getParameter("uname");
		String Pass = request.getParameter("pass");

			// loading drivers for oracle
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// creating connection with the database
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			PreparedStatement ps = con.prepareStatement("select * from Mytable where Name=? and Password=?");
			ps.setString(1, User);
			ps.setString(2, Pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next() == true) {
				out.print("valid");
			}
			else {
				out.print("invalid");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}