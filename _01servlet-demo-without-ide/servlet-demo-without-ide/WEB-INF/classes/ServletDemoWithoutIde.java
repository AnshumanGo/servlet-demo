import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ServletDemoWithoutIde extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String name=req.getParameter("name");
pw.println("Welcome "+name);
}}
