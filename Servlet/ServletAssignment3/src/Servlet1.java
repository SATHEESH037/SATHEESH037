import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet1 extends HttpServlet {
   public void doPost(HttpServletRequest request, HttpServletResponse response){
     try{
      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();

      String name = request.getParameter("userName");
      String password = request.getParameter("userPassword");
      String email=request.getParameter("usermail");
      String phoneno = request.getParameter("phone");
      String DoB = request.getParameter("date");
      
      /*pwriter.print("Hello "+name);
      pwriter.print("Your Password is: "+password);*/
      HttpSession session=request.getSession();
      session.setAttribute("uname",name);
      session.setAttribute("upass",password);
      session.setAttribute("umail",email);
      session.setAttribute("uphone",phoneno);
      session.setAttribute("udate",DoB);
      pwriter.print("<a href='welcome'>Details</a>");
      
      pwriter.close();
    }catch(Exception exp){
       System.out.println(exp);
     }
  }
}