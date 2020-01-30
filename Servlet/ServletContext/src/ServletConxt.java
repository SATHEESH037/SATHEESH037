import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class ServletConxt extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter();

ServletContext context=getServletContext();  
String name=context.getInitParameter("TalentSculptors_Course_Fee");  
pw.println(" TalentSculptors_Course_Fee is="+name);  
  
pw.close();  
  
}}  