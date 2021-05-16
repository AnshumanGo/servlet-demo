package com.example.servletconfigcontextattribute;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        ServletContext servletContext=getServletContext();

        String userName=((String)servletContext.getAttribute("userName")).toUpperCase();

        out.print("<head>\n" +
                "    <title>Welcome - "+userName+"</title>\n" +
                "</head>");
        out.print("Welcome "+userName);
    }
}