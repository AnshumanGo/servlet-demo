package com.example.servletconfigcontextattribute;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletConfig config=getServletConfig();

        String userName=config.getInitParameter("userName");
        String userPassword=config.getInitParameter("userPassword");

        ServletContext servletContext=getServletContext();
        servletContext.setAttribute("userName",userName);

        if(userPassword.equals("servlet")){

            RequestDispatcher rd=request.getRequestDispatcher("/welcome");
            rd.include(request, response);
        } else{
            out.print("Sorry UserName or Password Error!");
            RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
            rd.include(request, response);

        }
    }

}