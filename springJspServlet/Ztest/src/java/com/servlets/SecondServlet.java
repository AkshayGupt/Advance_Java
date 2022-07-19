package com.servlets;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet {

    /*
    TYPE2: Extending GenericServlet
    
    The GenericServlet already has the body for other 4 methods: init, destroy, getServletConfig, setServletConfig.
    But the service method still is a abstract method in this class. So, we need to override the method and add the body to it.
    Hence, in this method we only need to override a single method.
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Using GenericServlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is my second servlet using GenericServlet.</h1>");
    }
}
