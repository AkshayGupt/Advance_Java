package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ThirdServlet extends HttpServlet {

    /*
    TYPE3: Extending HttpServlet
    
    This class has body of all the methods. We can override the required methods if we need.
    We can add other methods like doPost, etc.
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Get method called");
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<h1>This is the third servlet using HttpServlet.</h1>");
    }
}
