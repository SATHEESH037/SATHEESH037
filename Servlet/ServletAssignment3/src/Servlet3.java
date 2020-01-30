import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet3 extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response){
  try{
      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();
      HttpSession session=request.getSession(false);
      String myName=(String)session.getAttribute("uname");
      String myPass=(String)session.getAttribute("upass");
      String myMail=(String)session.getAttribute("umail");
      String myPhone=(String)session.getAttribute("uphone");
      String myDoB=(String)session.getAttribute("udate");
      pwriter.print("Name: "+myName+"<br> Password: "+myPass+"<br> E-Mail: "+myMail+"<br> Phone No:"+myPhone+"<br> Date Of Birth:"+myDoB);
      pwriter.close();
  }catch(Exception exp){
      System.out.println(exp);
   }
  }
}