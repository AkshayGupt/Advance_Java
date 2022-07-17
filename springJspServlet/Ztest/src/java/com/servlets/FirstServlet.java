package com.servlets;

import jakarta.servlet.Servlet;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FirstServlet implements Servlet{
    
    ServletConfig conf;
    
    //LIFECYCLE-METHODS
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Creating object..");
    }
    
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        System.out.println("Servicing...");
        //Set the content-type of the respone
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hi there!</h1>");
        out.println("<h4>Today's date: "+new Date().toString()+"</h4>");
    }
    
    public void destroy (){
           System.out.println("Going to destroy servlet object.");
    }
    
    //NON-LIFECYCLE METHODS
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    public String getServletInfo(){
        return "Created by Akshay"
    }
    
}
