package com.example.servletrequestdispatcher;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName=request.getParameter("userName");
        String userPassword=request.getParameter("userPassword");

        if(userPassword.equals("servlet")){
            RequestDispatcher rd=request.getRequestDispatcher("welcome");
            rd.forward(request, response);
        }
    else{
            out.print("Sorry UserName or Password Error!");
            RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
            rd.include(request, response);

        }
    }

}