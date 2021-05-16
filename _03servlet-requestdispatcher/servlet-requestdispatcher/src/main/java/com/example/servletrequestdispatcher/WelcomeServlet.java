package com.example.servletrequestdispatcher;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");


        PrintWriter out = response.getWriter();

        String userName=request.getParameter("userName").toUpperCase();
        out.print("<head>\n" +
                "    <title>Welcome - "+userName+"</title>\n" +
                "</head>");
        out.print("Welcome "+userName);
    }

}